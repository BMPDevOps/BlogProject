package org.example.blogproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.config.MinioConfig;
import org.example.blogproject.dto.MemberDto;
import org.example.blogproject.service.MemberService;
import org.example.blogproject.service.MinioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final MinioService minioService = new MinioService(new MinioConfig());

    @PostMapping
    public List<MemberDto> getMembers() {
        return memberService.findMemberAll();
    }

    @PostMapping("upload")
    public String upload(@RequestParam String bucketName, @RequestParam String directory, @RequestParam MultipartFile file) {
        return minioService.uploadFile(bucketName, directory, file);
    }
}
