package top.chen.forum.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

/**
 * Author:CJQ
 * Date:2023/10/26
 * 用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
}
