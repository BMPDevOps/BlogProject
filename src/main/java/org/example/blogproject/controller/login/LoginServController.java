package org.example.blogproject.controller.login;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import lombok.RequiredArgsConstructor;
import org.example.blogproject.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginServController {
    @GetMapping("/")
    public String login() {
        return "redirect:/main";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("id");
        session.removeAttribute("passwd");
        return "redirect:/";
    }

    @GetMapping("/main")
    public String mainPage() {
        return "mainPage/next";
    }



    @GetMapping("/newBlog")
    public String newBlogPage() {
        return "mainPage/newBlog";
    }

    @GetMapping("/searchId")
    public String searchId(){
        return "login/searchId";
    }
    
    @GetMapping("/searchPwd")
    public String searchPwd(){
        return "login/searchPwd";
    }

}
