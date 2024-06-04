package org.example.blogproject.controller.blog;


import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.BlogDto;
import org.example.blogproject.service.blog.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/blog")
public class BlogServController {
    private final BlogService blogService;

    @GetMapping
    public String blog(Model model,
                       @RequestParam int blog_idx) {
        model.addAttribute("dto",blogService.blogFindByIdx(blog_idx));
        return "mainPage/blog";
    }
}
