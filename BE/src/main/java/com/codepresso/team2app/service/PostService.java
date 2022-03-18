package com.codepresso.team2app.service;

import com.codepresso.team2app.mapper.HashTagMapper;
import com.codepresso.team2app.mapper.PostMapper;
import com.codepresso.team2app.vo.HashTag;
import com.codepresso.team2app.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;
    private HashTagMapper hashTagMapper;

//    public PostService(PostMapper postMapper) {
//        this.postMapper = postMapper;
//    }

    public PostService(PostMapper postMapper, HashTagMapper hashTagMapper) {
        this.postMapper = postMapper;
        this.hashTagMapper = hashTagMapper;
    }

    public boolean savePost(Post post, HashTag hashTag){
        Integer result = postMapper.save(post, hashTag);
        hashTagMapper.saveHashTag(hashTag);
        return result == 1;
    }

    public List<Post> getAllPost() {
        return postMapper.findAllPost();
    }
}
