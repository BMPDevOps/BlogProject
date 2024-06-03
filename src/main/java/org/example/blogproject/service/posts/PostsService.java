package org.example.blogproject.service.posts;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.PostsDto;
import org.example.blogproject.mapper.PostMapperInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostsService {
    private final PostMapperInterface postMapperInterface;
    public void postSave(PostsDto dto) {
        postMapperInterface.postSave(dto);
    }
    public void postUpdate(PostsDto dto) {
        postMapperInterface.postUpdate(dto);
    }
    public PostsDto postsFindByPostsId(int idx) {
        return postMapperInterface.postsFindByPostsId(idx);
    }
    public void postsDeleteByPostsId(int idx) {
        postMapperInterface.postsDeleteByPostsId(idx);
    }
    public List<PostsDto> postsFindByBlogId(int idx) {
        return postMapperInterface.postsFindByBlogId(idx);
    }
}
