package top.chen.forum.post.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import top.chen.forum.post.entity.Post;

import java.util.List;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
public interface PostService extends IService<Post>{
    List<Post> getList(Integer pageNo, Integer pageSize);
}
