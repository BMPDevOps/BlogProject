package org.example.blogproject.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginServController {
    @GetMapping("/")
    public String login() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login/login";
    }
}
