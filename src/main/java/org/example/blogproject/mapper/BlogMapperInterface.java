package org.example.blogproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.blogproject.dto.BlogDto;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface BlogMapperInterface {

    void blogSave(BlogDto dto);

    List<Map<String, Object>> blogFindByIdJoin();
}
