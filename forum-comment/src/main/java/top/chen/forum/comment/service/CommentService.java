package top.chen.forum.comment.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import top.chen.forum.comment.entity.Comment;

import java.util.List;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
public interface CommentService extends IService<Comment>{
    List<Comment> getList(Integer pageNo, Integer pageSize, Integer postId);
}
