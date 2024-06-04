package org.example.blogproject.controller.blog;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.BlogDto;
import org.example.blogproject.service.blog.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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
    public void blogSave(@ModelAttribute BlogDto dto,
                         HttpSession session) {
        dto.setId((String) session.getAttribute("id"));
        blogService.blogSave(dto);
    }

    @PostMapping("/blogCheck")
    public boolean blogCheckById(HttpSession session)
    {
        String id = (String) session.getAttribute("id");
        return blogService.blogCheckById(id);
    }
}
