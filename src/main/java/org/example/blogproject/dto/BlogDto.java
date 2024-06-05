package org.example.blogproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Alias("BlogDto")
public class BlogDto {

  private long blog_idx;
  private String id;
  private String blog_name;
  private java.sql.Timestamp regDate;
}
