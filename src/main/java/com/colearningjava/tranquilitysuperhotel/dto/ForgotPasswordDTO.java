package com.colearningjava.tranquilitysuperhotel.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ForgotPasswordDTO {
    String email;
    String password;
    String confirmPassword;
}