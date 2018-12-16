package top.zhangsun.bean.config;

/**
 * Function:
 * RESTful naming convention
 * GET /tickets # 获取ticket列表
 * GET /tickets/12 # 查看某个具体的ticket
 * POST /tickets # 新建一个ticket
 * PUT /tickets/12 # 更新ticket 12.
 * DELETE /tickets/12 #删除ticekt 12
 *
 * @author zhangsunjiankun - 2018/12/16 上午11:53
 */
public class UrlMapping {

    public static final String ACTIVITIES = "/bean/activities";
    public static final String ACTIVITIES_ID = "/bean/activity/{id}";

}
