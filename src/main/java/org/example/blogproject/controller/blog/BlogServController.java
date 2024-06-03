package org.example.blogproject.controller.blog;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.service.blog.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/blog")
public class BlogServController {
    private final BlogService blogService;
}
