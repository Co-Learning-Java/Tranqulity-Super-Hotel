package com.colearningjava.tranquilitysuperhotel.models;

import com.colearningjava.tranquilitysuperhotel.enums.Gender;
import com.colearningjava.tranquilitysuperhotel.enums.Role;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User extends Base{
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String username;
    private String password;
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private Role role;
}
