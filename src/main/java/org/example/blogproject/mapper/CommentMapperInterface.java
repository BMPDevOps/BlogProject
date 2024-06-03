package org.example.blogproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.blogproject.dto.CommentDto;

import java.util.List;

@Mapper
public interface CommentMapperInterface {
    void commentSave(CommentDto dto);
    void commentUpdate(CommentDto dto);
    void commentDeleteByCommentId(int idx);
    List<CommentDto> commentFindByPostsId(int idx);
}
