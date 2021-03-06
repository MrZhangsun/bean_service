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
 * @author zhangsunjiankun - 2018/12/16 上午11:11
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ActivityForm {

    private Integer id;

    private String title;

    private String description;

    private Integer type;

    private Integer author;

    private Integer bean;

    private Integer boss;

    @JsonProperty("bean_total")
    private Integer beanTotal;

    @JsonProperty("start_time")
    private Date startTime;

    @JsonProperty("end_time")
    private Date endTime;
}
