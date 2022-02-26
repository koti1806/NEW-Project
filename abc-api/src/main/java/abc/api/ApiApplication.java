package abc.api;

import abc.core.common.config.CommonConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动类
 *
 * @author IBIT程序猿
 */
@SpringBootApplication(scanBasePackages = {
        "abc"
})
@MapperScan(basePackages = {
        "abc.db.mapper"
})
@EnableAsync
@Import(CommonConfig.class)
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
