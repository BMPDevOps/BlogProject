package org.example.blogproject.dto;


import lombok.*;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Setter
@Getter
@ToString
@Alias("PostsDto")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostsDto {

  private long post_idx;
  private long blog_idx;
  private String title;
  private String content;
  private Timestamp posting_date;


}
