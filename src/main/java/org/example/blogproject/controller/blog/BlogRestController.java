package org.example.blogproject.controller.blog;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.BlogDto;
import org.example.blogproject.service.blog.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/blog")
public class BlogRestController {
    private final BlogService blogService;

    @PostMapping("/list")
    public List<Map<String, Object>> list() {
         return blogService.blogFindByIdJoin(); // <1>

    }
    @PostMapping("/save")
    public void blogSave(@ModelAttribute BlogDto dto) {
        blogService.blogSave(dto);
    }
}
