package top.chen.forum.user.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chen.forum.common.resp.Result;
import top.chen.forum.user.entity.User;
import top.chen.forum.user.entity.UserLoginResp;
import top.chen.forum.user.service.UserService;

/**
 * Author:CJQ
 * Date:2023/10/26
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping()
    public Result register(@RequestBody User user) {
        Result resp = new Result<>();
        userService.register(user);
        resp.setMsg("用户注册成功");
        return resp;
    }

    @PostMapping("/login")
    public Result login(@Valid @RequestBody User user) {
        UserLoginResp userLoginResp = userService.login(user);
        Result<UserLoginResp> resp = new Result<>();
        resp.setData(userLoginResp);
        return resp;
    }
}
