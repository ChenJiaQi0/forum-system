package top.chen.forum.comment.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.chen.forum.comment.entity.Comment;
import top.chen.forum.comment.service.CommentService;
import top.chen.forum.common.resp.Result;

import java.util.List;

/**
 * @author ChenQi
 * @date 2023/10/27
 * @description: CommentController
 */
@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {
    // 定义每页最多的数据量，以防前端定义传递超大参数，造成页面数据量过大
    private final int MAX = 100;

    @Resource
    private CommentService commentService;

    /**
     * 评论
     * @param comment
     * @return
     */
    @PostMapping
    public Result<Boolean> comment(@Valid @RequestBody Comment comment) {
        Result<Boolean> resp = new Result<>();
        resp.setData(commentService.save(comment));
        return resp;
    }

    /**
     * 当前帖子的评论的分页查询
     * @param pageNo
     * @param pageSize
     * @param postId
     * @return
     */
    @GetMapping
    public Result<List<Comment>> list(@RequestParam(required = false, defaultValue = "1") Integer pageNo,
                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                      @RequestParam Integer postId){
        if (pageSize > MAX) {
            pageSize = MAX;
        }

        Result<List<Comment>> resp = new Result<List<Comment>>();
        resp.setData(commentService.getList(pageNo, pageSize, postId));
        return resp;
    }
}
