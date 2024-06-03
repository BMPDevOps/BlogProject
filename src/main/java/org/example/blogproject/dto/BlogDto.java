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

  private long blogIdx;
  private String id;
  private String blogName;
  private java.sql.Timestamp regDate;
}
