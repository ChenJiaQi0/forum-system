package top.chen.forum.comment.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.chen.forum.comment.entity.Comment;
import top.chen.forum.comment.mapper.CommentMapper;
import top.chen.forum.comment.service.CommentService;

import java.util.List;
import java.util.Queue;


/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getList(Integer pageNo, Integer pageSize, Integer postId) {
        Page<Comment> page = Page.of(pageNo, pageSize);
        QueryWrapper<Comment> wrapper = new QueryWrapper<>();
        wrapper.eq("post_id", postId);
        List<Comment> list = commentMapper.selectList(page, wrapper);
        return list;
    }
}
