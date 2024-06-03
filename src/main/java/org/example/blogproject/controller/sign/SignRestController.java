package org.example.blogproject.controller.sign;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.UserDto;
import org.example.blogproject.mapper.UserMapperInterface;
import org.example.blogproject.service.minio.MinioService;
import org.example.blogproject.service.user.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
public class SignRestController {
    public final UserService userService;
    public final MinioService minioService;
    //회원 가입 시 ID 체크 로직
    @PostMapping("/signup/id_check")
    public Boolean idCheck(@RequestParam String id){
        return userService.userFindById(id) >= 1;
    }
    // 회원 가입 로직
    @PostMapping("/signup/insertUser")
    public void insertUser(@ModelAttribute UserDto dto,
                           @RequestParam MultipartFile file){
        String fileName = minioService.uploadFile("blog", "user/"+dto.getId(), file);
        dto.setPhoto("user/"+dto.getId()+"/"+fileName);
        userService.userSave(dto);
    }
}
