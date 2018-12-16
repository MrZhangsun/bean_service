package top.zhangsun.bean.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.zhangsun.bean.pojo.dto.ResultDTO;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/16 上午11:32
 */

@RestControllerAdvice
public class GlobalExceptionAdvise {

    @ExceptionHandler(ClientException.class)
    public ResultDTO clientExceptionHandler(ClientException exception) {
        return new ResultDTO<String>().error(exception.getBusinessMessage(), exception.getTechnicalMessage(), exception.getCode());
    }
}
