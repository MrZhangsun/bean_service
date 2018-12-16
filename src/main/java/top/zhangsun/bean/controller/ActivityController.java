package top.zhangsun.bean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import top.zhangsun.bean.config.UrlMapping;
import top.zhangsun.bean.exception.ClientException;
import top.zhangsun.bean.pojo.dto.ResultDTO;
import top.zhangsun.bean.pojo.form.ActivityForm;
import top.zhangsun.bean.pojo.vo.ActivityVO;
import top.zhangsun.bean.service.api.ActivityService;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/16 上午1:08
 */
@RestController
public class ActivityController {

    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    /**
     * Create activity
     *
     * @param activityForm activity form details
     * @return create success status
     */
    @PostMapping(UrlMapping.ACTIVITIES)
    public ResultDTO createActivity(@RequestBody ActivityForm activityForm) {
        Integer add = activityService.add(activityForm);
        return new ResultDTO<Integer>().ok(add);
    }

    /**
     * Update activity details selectively
     *
     * @param activityForm activity details
     * @param id activity primary key
     * @return update success status
     */
    @PutMapping(UrlMapping.ACTIVITIES_ID)
    public ResultDTO updateActivity(@RequestBody ActivityForm activityForm, @PathVariable(value = "id") Integer id) {
        if (!id.equals(activityForm.getId())) {
            throw new ClientException("Activity ID don't matches with path id!", HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    HttpStatus.BAD_REQUEST.value());
        }
        activityService.update(activityForm);
        return new ResultDTO<Integer>().ok(id);
    }

    /**
     * Find all activities
     *
     * @return activity list
     */
    @GetMapping(UrlMapping.ACTIVITIES)
    public ResultDTO findAll() {
        List<ActivityVO> all = activityService.findAll();
        return new ResultDTO<>().ok(all);
    }

    /**
     * Delete(logically) activity by ID
     *
     * @param id activity ID
     * @return activity ID
     */
    @DeleteMapping(UrlMapping.ACTIVITIES_ID)
    public ResultDTO deleteById(@PathVariable(value = "id") Integer id) {
        activityService.delete(id);
        return new ResultDTO<Integer>().ok(id);
    }
}
