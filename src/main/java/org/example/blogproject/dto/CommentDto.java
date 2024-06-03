package org.example.blogproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Builder
@Alias("CommentDto")
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

  private long commentIdx;
  private long postIdx;
  private String comment;
  private Timestamp comment_date;
}
