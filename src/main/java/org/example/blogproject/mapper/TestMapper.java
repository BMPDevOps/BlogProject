package org.example.blogproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.blogproject.dto.MemberDto;

import java.util.List;

@Mapper
public interface TestMapper {
    @Select("select * from memberdb")
    public List<MemberDto> findMemberAll();
}
