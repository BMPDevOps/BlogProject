package org.example.blogproject.service;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.MemberDto;
import org.example.blogproject.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final TestMapper member;

    public List<MemberDto> findMemberAll() {
        return member.findMemberAll();
    }
}
