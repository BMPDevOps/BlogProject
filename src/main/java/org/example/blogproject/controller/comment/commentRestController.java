package org.example.blogproject.controller.comment;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.CommentDto;
import org.example.blogproject.service.comment.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class commentRestController {
    private final CommentService commentService;
    //댓글 작성
    @PostMapping("/save")
    public void commentSave(@ModelAttribute CommentDto dto){
        commentService.commentSave(dto);
    }
    //댓글 수정
    @PostMapping("/update")
    public void commentUpdate(@ModelAttribute CommentDto dto){
        commentService.commentUpdate(dto);
    }
    //댓글 삭제
    @PostMapping("/delete")
    public void commentDelete(@RequestParam int idx){
        commentService.commentDeleteByCommentId(idx);
    }
    //댓글 조회
    @PostMapping("/find")
    public List<CommentDto> commentFindByCommentId(@RequestParam int idx){
        return commentService.commentFindByPostsId(idx);
    }

}
