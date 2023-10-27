package top.chen.forum.user.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:CJQ
 * Date:2023/10/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginResp {
    private User user;
    private String token;
}
