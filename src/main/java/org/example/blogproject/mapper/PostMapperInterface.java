package org.example.blogproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.blogproject.dto.PostsDto;

import java.util.List;

@Mapper
public interface PostMapperInterface {
    void postSave(PostsDto dto);
    void postUpdate(PostsDto dto);
    List<PostsDto> postsFindByBlogId(int idx);
    PostsDto postsFindByPostsId(int idx);
    void postsDeleteByPostsId(int idx);
}
