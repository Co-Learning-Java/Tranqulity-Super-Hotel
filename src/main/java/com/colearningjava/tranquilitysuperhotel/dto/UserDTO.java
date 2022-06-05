package com.colearningjava.tranquilitysuperhotel.dto;

import com.colearningjava.tranquilitysuperhotel.enums.Gender;
import com.colearningjava.tranquilitysuperhotel.enums.Role;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;
    private Gender gender;
    private Role role;
}
