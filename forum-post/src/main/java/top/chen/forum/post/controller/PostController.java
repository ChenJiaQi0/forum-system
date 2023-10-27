package top.chen.forum.post.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.chen.forum.common.resp.Result;
import top.chen.forum.common.util.tokenUtil;
import top.chen.forum.post.annotation.Authenticated;
import top.chen.forum.post.entity.Post;
import top.chen.forum.post.service.PostService;

import java.util.List;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {
    // 定义每页最多的数据量，以防前端定义传递超大参数，造成页面数据量过大
    private final int MAX = 100;

    @Resource
    private PostService postService;

    /**
     * 编辑帖子
     * @param post
     * @return
     */
    @PutMapping("/{id}")
    @Authenticated
    public Result<Boolean> edit(@PathVariable Integer id, @RequestBody Post post){
        System.out.println(post);
        Result<Boolean> resp = new Result<>();
        resp.setData(postService.updateById(post));
        return resp;
    }

    /**
     * 删除帖子
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @Authenticated
    public Result<Boolean> delete(@PathVariable Integer id){
        Result<Boolean> resp = new Result<>();
        resp.setData(postService.removeById(id));
        return resp;
    }

    /**
     * 帖子的分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping
    public Result<List<Post>> list(@RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                   @RequestParam(required = false, defaultValue = "5") Integer pageSize){
        if (pageSize > MAX) {
            pageSize = MAX;
        }

        Result<List<Post>> resp = new Result<List<Post>>();
        resp.setData(postService.getList(pageNo, pageSize));
        return resp;
    }

    /**
     * 发帖
     * @param post
     * @return
     */
    @PostMapping
    public Result<Boolean> savePost(@RequestBody Post post,@Valid @RequestHeader(value = "token") String token){
        Integer userId = tokenUtil.getUserIdFromToken(token);
        post.setUserId(userId);
        Result<Boolean> resp = new Result<>();
        resp.setData(postService.save(post));
        return resp;
    }

    @GetMapping("/test")
    public Integer getId(@RequestHeader(value = "token") String token){
        return tokenUtil.getUserIdFromToken(token);
    }
}
