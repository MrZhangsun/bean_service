package top.zhangsun.bean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Function: Application Enter Point.
 *
 * @author zhangsunjiankun - 2018/12/16 上午11:28
 */
@SpringBootApplication
@MapperScan(value = "top.zhangsun.bean.mapper")
public class BeanServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanServiceApplication.class, args);
    }

}

