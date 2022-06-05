package com.colearningjava.tranquilitysuperhotel.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ChangePasswordDTO {
    String oldPassword;
    String password;
    String confirmPassword;
}
