package top.zhangsun.bean.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/16 下午12:59
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ActivityVO {

    private Integer id;

    private String title;

    private String description;

    private Integer type;

    private Integer author;

    private Integer bean;

    @JsonProperty("bean_total")
    private Integer beanTotal;

    private Integer boss;

    @JsonProperty("start_time")
    private Date startTime;

    @JsonProperty("end_time")
    private Date endTime;
}
