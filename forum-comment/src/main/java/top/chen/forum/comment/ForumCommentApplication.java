package top.chen.forum.comment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("top.chen")
@MapperScan("top.chen.*.*.mapper")
public class ForumCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumCommentApplication.class, args);
    }

}
