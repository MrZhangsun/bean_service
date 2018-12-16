package top.zhangsun.bean.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Function: Client exception
 *
 * @author zhangsunjiankun - 2018/12/16 上午11:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ClientException extends RuntimeException {

    private String businessMessage;

    private String technicalMessage;

    private Integer code;

    public ClientException(String businessMessage, String technicalMessage, int code) {
        this.businessMessage = businessMessage;
        this.technicalMessage = technicalMessage;
        this.code = code;
    }
}
