package org.example.blogproject.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginServController {
    @GetMapping("/")
    public String login() {
        return "login/login";
    }
}
