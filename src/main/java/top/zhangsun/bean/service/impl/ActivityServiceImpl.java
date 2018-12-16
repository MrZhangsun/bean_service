package top.zhangsun.bean.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import top.zhangsun.bean.exception.ClientException;
import top.zhangsun.bean.mapper.ActivityEntityMapper;
import top.zhangsun.bean.pojo.entity.ActivityEntity;
import top.zhangsun.bean.pojo.entity.ActivityEntityExample;
import top.zhangsun.bean.pojo.form.ActivityForm;
import top.zhangsun.bean.pojo.form.ActivitySearchForm;
import top.zhangsun.bean.pojo.vo.ActivityVO;
import top.zhangsun.bean.service.api.ActivityService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Function: Activity manager service implement layer.
 *
 * @author zhangsunjiankun - 2018/12/16 上午1:11
 */
@Service
@Slf4j
public class ActivityServiceImpl implements ActivityService {

    private final ActivityEntityMapper activityEntityMapper;

    @Autowired
    public ActivityServiceImpl(ActivityEntityMapper activityEntityMapper) {
        this.activityEntityMapper = activityEntityMapper;
    }

    /**
     * @see ActivityService#add(ActivityForm)
     * @param activity activity details
     */
    @Override
    public Integer add(ActivityForm activity) {
        ActivityEntity activityEntity = new ActivityEntity();

        activityEntity.setTitle(activity.getTitle());
        activityEntity.setDescription(activity.getDescription());
        activityEntity.setAuthor(activity.getAuthor());
        activityEntity.setType(activity.getType());
        activityEntity.setLogoUrl(activity.getLogoUrl());
        activityEntity.setPicsUrl(activity.getPicsUrl());
        activityEntity.setStartTime(activity.getStartTime());
        activityEntity.setEndTime(activity.getEndTime());

        activityEntity.setCreateTime(new Date());
        activityEntity.setUpdateTime(new Date());
        activityEntity.setDelete(Boolean.FALSE);
        activityEntityMapper.insert(activityEntity);
        return activityEntity.getId();
    }

    /**
     * @see ActivityService#delete(Integer)
     * @param id activity primary key
     */
    @Override
    public void delete(Integer id) {
        if (id == null) {
            throw new ClientException("Activity ID can't be empty!", HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    HttpStatus.BAD_REQUEST.value());
        }
        ActivityEntity activityEntity = new ActivityEntity();
        activityEntity.setId(id);
        activityEntity.setDelete(Boolean.TRUE);
        activityEntityMapper.updateByPrimaryKeySelective(activityEntity);
    }

    /**
     * @see ActivityService#update(ActivityForm)
     * @param activity activity details
     */
    @Override
    public void update(ActivityForm activity) {
        if (activity.getId() == null) {
            throw new ClientException("Activity ID can't be empty!", HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    HttpStatus.BAD_REQUEST.value());
        }

        ActivityEntity activityEntity = new ActivityEntity();
        activityEntity.setId(activity.getId());
        activityEntity.setTitle(activity.getTitle());
        activityEntity.setDescription(activity.getDescription());
        activityEntity.setAuthor(activity.getAuthor());
        activityEntity.setType(activity.getType());
        activityEntity.setLogoUrl(activity.getLogoUrl());
        activityEntity.setPicsUrl(activity.getPicsUrl());
        activityEntity.setStartTime(activity.getStartTime());
        activityEntity.setEndTime(activity.getEndTime());

        activityEntity.setUpdateTime(new Date());
        activityEntityMapper.updateByPrimaryKeySelective(activityEntity);
    }

    /**
     * @see ActivityService#findAll(ActivitySearchForm)
     * @return Activity list
     */
    @Override
    public List<ActivityVO> findAll(ActivitySearchForm searchForm) {
        ActivityEntityExample example = new ActivityEntityExample();
        ActivityEntityExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteEqualTo(Boolean.FALSE);
        if (!StringUtils.isEmpty(searchForm.getTitle())) {
            criteria.andTitleLike(searchForm.getTitle());
        }
        if (!StringUtils.isEmpty(searchForm.getDescription())) {
            criteria.andDescriptionLike(searchForm.getDescription());
        }
        if (!StringUtils.isEmpty(searchForm.getAuthor())) {
            criteria.andAuthorEqualTo(searchForm.getAuthor());
        }
        if (searchForm.getType() != null) {
            criteria.andTypeEqualTo(searchForm.getType());
        }
        if (searchForm.getStartTime() != null) {
            criteria.andStartTimeGreaterThanOrEqualTo(searchForm.getStartTime());
        }
        if (searchForm.getEndTime() != null) {
            criteria.andEndTimeLessThanOrEqualTo(searchForm.getEndTime());
        }

        // Setting page information
        PageHelper.startPage(searchForm.getPageNum(), searchForm.getPageSize(), searchForm.getOrderBy());
        List<ActivityEntity> activityEntityList = activityEntityMapper.selectByExample(example);
        List<ActivityVO> activityVOList = new ArrayList<>(activityEntityList.size());

        activityEntityList.forEach(item -> activityVOList.add(new ActivityVO(item.getId(), item.getTitle(), item.getDescription(), item.getType(),
                item.getAuthor(), item.getStartTime(), item.getEndTime(), item.getLogoUrl(), item.getPicsUrl())));

        return activityVOList;
    }
}
