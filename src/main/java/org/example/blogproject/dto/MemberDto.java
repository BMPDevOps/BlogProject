package org.example.blogproject.dto;

import lombok.*;

@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

  private long idx;
  private String id;
  private String passwd;
  private String name;
  private String addr;
  private String hp;
  private String email;
  private String photo;
  private String birthDay;
  private java.sql.Timestamp regDate;


}
