package org.example.blogproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.blogproject.dto.UserDto;

import java.util.Map;

@Mapper
public interface UserMapperInterface {
    int userFindById(String id);

    void userSave(UserDto dto);

    int userCheckByIdAndPassword(Map<String,String> map);
}
