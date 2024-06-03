package org.example.blogproject.service.comment;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.CommentDto;
import org.example.blogproject.mapper.CommentMapperInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentMapperInterface commentMapperInterface;

    public void commentSave(CommentDto dto){
        commentMapperInterface.commentSave(dto);
    }
    public void commentUpdate(CommentDto dto){
        commentMapperInterface.commentUpdate(dto);
    }
    public void commentDeleteByCommentId(int idx){
        commentMapperInterface.commentDeleteByCommentId(idx);
    }
    public List<CommentDto> commentFindByPostsId(int idx){
        return commentMapperInterface.commentFindByPostsId(idx);
    }

}
