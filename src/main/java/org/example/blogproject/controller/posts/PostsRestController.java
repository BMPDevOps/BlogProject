package org.example.blogproject.controller.posts;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.PostsDto;
import org.example.blogproject.service.posts.PostsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostsRestController {
    private final PostsService postsService;

    //게시물 작성
    @PostMapping("/save")
    public void postsSave(@RequestParam int blog_idx,
                          @RequestParam String title,
                          @RequestParam String content) {
        PostsDto dto = PostsDto.builder()
                .blog_idx(blog_idx)
                .title(title)
                .content(content)
                .build();
        postsService.postSave(dto);
    }

    //게시물 수정
    @PostMapping("/update")
    public void postsUpdate(@ModelAttribute PostsDto dto) {
        postsService.postUpdate(dto);
    }

    //게시물 리스트
    @PostMapping("/list")
    public List<PostsDto> postsFindByPostsId(@RequestParam int idx) {
        return postsService.postsFindByBlogId(idx);
    }

    //게시물 조회
    @PostMapping("/find")
    public PostsDto postsFindByBlogId(@RequestParam int idx) {
        return postsService.postsFindByPostsId(idx);
    }

    //게시물 삭제
    @PostMapping("/delete")
    public void postsDeleteByPostsId(@RequestParam int idx) {
        postsService.postsDeleteByPostsId(idx);
    }


}
