package org.example.blogproject.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Alias("UserDto")
public class UserDto {

  private String id;
  private String passwd;
  private String name;
  private String photo;
  private String email;
  private java.sql.Timestamp regDate;

}
