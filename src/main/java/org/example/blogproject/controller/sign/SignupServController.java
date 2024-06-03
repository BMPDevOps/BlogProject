package org.example.blogproject.controller.sign;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupServController {
    @GetMapping("/signup")
    public String signupForm() {
        return "sign/signup";
    }
}
