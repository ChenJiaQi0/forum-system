package top.chen.forum.post.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

/**
 * Author:CJQ
 * Date:2023/10/26
 * 帖子实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Post {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private int userId;
    private String title;
    private String content;
}
