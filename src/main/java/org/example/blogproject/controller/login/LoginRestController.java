package org.example.blogproject.controller.login;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.example.blogproject.service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginRestController {
    public final UserService userService;

    // 로그인 로직
    @PostMapping("/login/check")
    public boolean loginCheck(@RequestParam String id,
                              @RequestParam String passwd,
                              HttpSession session){

        if(userService.userCheckByIdAndPassword(id, passwd) >= 1){
            session.setAttribute("id",id);
            session.setAttribute("passwd",passwd);
            return true;
        }
        return false;
    }



}
