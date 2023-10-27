package top.chen.forum.comment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Author:CJQ
 * Date:2023/10/26
 * 评论实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @NotNull(message = "帖子id不能为空")
    private int postId;
    @NotNull(message = "评论人id不能为空")
    private int userId;
    @NotNull(message = "评论内容不能为空")
    private String content;
}
