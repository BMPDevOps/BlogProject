package org.example.blogproject.service.blog;

import lombok.RequiredArgsConstructor;
import org.example.blogproject.dto.BlogDto;
import org.example.blogproject.mapper.BlogMapperInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogMapperInterface blogMapperInterface;

    public void blogSave(BlogDto dto) {
        blogMapperInterface.blogSave(dto);
    }

    public List<Map<String, Object>> blogFindByIdJoin() {
        return blogMapperInterface.blogFindByIdJoin();
    }

    public BlogDto blogFindByIdx(int blog_idx) {return blogMapperInterface.blogFindByIdx(blog_idx);}

    public boolean blogCheckById(String id) {
        return blogMapperInterface.blogCheckById(id) >=1;
    }
}
