package org.example.blogproject.controller.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostsServController {

    @GetMapping("/postWrite")
    public String writePage(@RequestParam int blog_idx,
                            Model model) {
        model.addAttribute("blog_idx", blog_idx);
        return"mainPage/postWrite";
    }

    @GetMapping("/postPage")
    public String postPage(@RequestParam int post_idx,
                           Model model){
        model.addAttribute("post_idx", post_idx);
        return "mainPage/postPage";
    }
}
