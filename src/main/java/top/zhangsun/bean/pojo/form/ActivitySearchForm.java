package top.zhangsun.bean.pojo.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/16 下午2:05
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ActivitySearchForm {

    private Integer pageNum = 1;

    private Integer pageSize = 20;

    private String orderBy;

    private String title;

    private String description;

    private Integer type;

    private Integer author;

    private Integer boss;

    private Integer bean;

    @JsonProperty("start_time")
    private Date startTime;

    @JsonProperty("end_time")
    private Date endTime;
}
