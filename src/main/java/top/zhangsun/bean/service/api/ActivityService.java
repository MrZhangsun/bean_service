package top.zhangsun.bean.service.api;

import top.zhangsun.bean.pojo.form.ActivityForm;
import top.zhangsun.bean.pojo.form.ActivitySearchForm;
import top.zhangsun.bean.pojo.vo.ActivityVO;

import java.util.List;

/**
 * Function: Activity manager service interface layer.
 *
 * @author zhangsunjiankun - 2018/12/16 上午1:10
 */
public interface ActivityService {


    /**
     * Create activity
     *
     * @param activity activity details
     */
    Integer add(ActivityForm activity);

    /**
     * Delete activity
     *
     * @param id activity primary key
     */
    void delete(Integer id);

    /**
     * Update activity details
     *
     * @param activity activity details
     */
    void update(ActivityForm activity);

    /**
     * Find all activities
     *
     * @param searchForm search conditions
     * @return activity list
     */
    List<ActivityVO> findAll(ActivitySearchForm searchForm);
}
