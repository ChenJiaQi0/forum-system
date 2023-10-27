package top.chen.forum.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.chen.forum.common.exception.ServiceException;
import top.chen.forum.common.util.JwtUtil;
import top.chen.forum.user.entity.User;
import top.chen.forum.user.entity.UserLoginResp;
import top.chen.forum.user.mapper.UserMapper;
import top.chen.forum.user.service.UserService;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    /**
     * 注册
     * @param user
     * @return int
     */
    @Override
    public int register(User user) {
        if ("".equals(user.getUsername()) || "".equals(user.getPassword())) throw new ServiceException("注册信息未填写");

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", user.getUsername());
        User ifUser = baseMapper.selectOne(wrapper);
        if (ifUser == null) {
            return baseMapper.insert(user);
        } else {
            throw new ServiceException("用户已经被注册");
        }
    }

    /**
     * 登录并返回token
     * @param user
     * @return
     */
    @Override
    public UserLoginResp login(User user) {
        User userDB = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getUsername, user.getUsername()));
        if (userDB == null) {
            throw new ServiceException("用户未找到");
        }

        if (!userDB.getPassword().equals(user.getPassword())) {
            throw new ServiceException("用户名密码错误");
        }

        UserLoginResp userLoginResp = UserLoginResp.builder()
                .user(userDB)
                .build();

        String token = JwtUtil.createToken(userDB.getId(), userDB.getUsername());
        userLoginResp.setToken(token);
        return userLoginResp;
    }
}
