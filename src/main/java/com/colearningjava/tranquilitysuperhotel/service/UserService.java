package com.colearningjava.tranquilitysuperhotel.service;

import com.colearningjava.tranquilitysuperhotel.dto.ChangePasswordDTO;
import com.colearningjava.tranquilitysuperhotel.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<String> createUser(UserDTO userDTO);
    ResponseEntity<UserDTO> editUserDetails(UserDTO userDTO);
    ResponseEntity<UserDTO> changePassword(ChangePasswordDTO passwordDTO);
}
