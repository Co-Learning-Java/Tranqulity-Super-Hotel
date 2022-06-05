package com.colearningjava.tranquilitysuperhotel.service;

import com.colearningjava.tranquilitysuperhotel.dto.RoomDTO;
import com.colearningjava.tranquilitysuperhotel.dto.RoomTypeDTO;
import org.springframework.http.ResponseEntity;

public interface RoomService {
    ResponseEntity<String> createRoom(RoomDTO roomDTO);
    ResponseEntity<String> createRoomType(RoomTypeDTO roomTypeDto);
    ResponseEntity<String> addPictureToRoomType(String url, Long roomTypeID);
}
