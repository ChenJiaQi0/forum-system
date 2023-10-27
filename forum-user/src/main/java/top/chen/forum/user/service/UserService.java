package top.chen.forum.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.chen.forum.user.entity.User;
import top.chen.forum.user.entity.UserLoginResp;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
public interface UserService extends IService<User>{
    int register(User user);

    UserLoginResp login(User user);
}
