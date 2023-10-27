package top.chen.forum.post.aspect;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.chen.forum.common.exception.ServiceException;
import top.chen.forum.common.util.tokenUtil;
import top.chen.forum.post.annotation.Authenticated;
import top.chen.forum.post.entity.Post;
import top.chen.forum.post.service.PostService;

import java.util.Arrays;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 创建鉴权切面
 */
@Aspect
@Component
public class AuthenticatedAspect {
    @Resource
    private PostService postService;

    @Around("@within(authenticated) || @annotation(authenticated)")
    public Object checkAuthentication(ProceedingJoinPoint joinPoint, Authenticated authenticated) throws Throwable {
        //获取方法参数的帖子id
        Object[] args = joinPoint.getArgs();
        Integer postId = (Integer) args[0];

        //获取token
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String token = request.getHeader("token");

        //解析token得到当前登录用户的id
        Integer loginId = tokenUtil.getUserIdFromToken(token);

        //根据帖子的作者判断token解析出来的id是否一致
        Post post = postService.getById(postId);
        if (post.getUserId() == loginId) {
            return joinPoint.proceed();
        }else {
            throw new ServiceException("该用户没有权限编辑或修改此帖子");
        }
    }
}
