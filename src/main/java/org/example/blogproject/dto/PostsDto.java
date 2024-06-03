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

  private long postIdx;
  private long blogIdx;
  private String title;
  private String content;
  private Timestamp postingDate;


}
