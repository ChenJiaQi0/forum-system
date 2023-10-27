package top.chen.forum.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("top.chen")
@MapperScan("top.chen.*.*.mapper")
public class ForumUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumUserApplication.class, args);
    }

}
