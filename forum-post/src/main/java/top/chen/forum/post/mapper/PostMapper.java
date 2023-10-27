package top.chen.forum.post.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.chen.forum.post.entity.Post;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: 帖子DAO
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {
}
