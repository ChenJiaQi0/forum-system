package top.chen.forum.post.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import top.chen.forum.common.resp.Result;
import top.chen.forum.post.entity.Post;
import top.chen.forum.post.mapper.PostMapper;
import top.chen.forum.post.service.PostService;

import java.util.List;

/**
 * @author ChenQi
 * @date 2023/10/26
 * @description: TODO
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {
    @Resource
    private PostMapper postMapper;

    @Override
    public List<Post> getList(Integer pageNo, Integer pageSize) {
        Page<Post> page = Page.of(pageNo, pageSize);
        List<Post> list = postMapper.selectList(page, null);
        return list;
    }
}
