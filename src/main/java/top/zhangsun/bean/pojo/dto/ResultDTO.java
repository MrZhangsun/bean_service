package top.zhangsun.bean.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/16 上午11:36
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO<T> {

    private String businessMessage;

    private String technicalMessage;

    private Integer code;

    private T data;

    public ResultDTO<T> ok() {
        this.businessMessage = HttpStatus.OK.getReasonPhrase();
        this.technicalMessage = HttpStatus.OK.getReasonPhrase();
        this.code = HttpStatus.OK.value();
        return this;
    }

    public ResultDTO<T> error(String businessMessage, String technicalMessage, int code) {
        this.businessMessage = businessMessage;
        this.technicalMessage = technicalMessage;
        this.code = code;
        return this;
    }

    public ResultDTO<T> ok(T data) {
        ResultDTO<T> ok = ok();
        ok.setData(data);
        return ok;
    }
}
