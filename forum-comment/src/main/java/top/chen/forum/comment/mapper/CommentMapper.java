package top.chen.forum.comment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.chen.forum.comment.entity.Comment;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 评论DAO
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
