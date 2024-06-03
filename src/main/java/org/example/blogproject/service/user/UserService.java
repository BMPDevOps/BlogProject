package org.example.blogproject.service.user;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.UserDto;
import org.example.blogproject.mapper.UserMapperInterface;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    public final UserMapperInterface userMapperInterface;


    public int userFindById(String id) {
        return userMapperInterface.userFindById(id);
    }

    public void userSave(UserDto dto) {
        userMapperInterface.userSave(dto);
    }

    public int userCheckByIdAndPassword(String id, String passwd) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("id",id);
        map.put("passwd",passwd);
        return userMapperInterface.userCheckByIdAndPassword(map);
    }
}
