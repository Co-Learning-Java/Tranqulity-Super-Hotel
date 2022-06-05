package com.colearningjava.tranquilitysuperhotel.service.impl;

import com.colearningjava.tranquilitysuperhotel.dto.RoomDTO;
import com.colearningjava.tranquilitysuperhotel.dto.RoomTypeDTO;
import com.colearningjava.tranquilitysuperhotel.repository.RoomRepository;
import com.colearningjava.tranquilitysuperhotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepo;

    @Override
    public ResponseEntity<String> createRoom(RoomDTO roomDTO) {
        return null;
    }

    @Override
    public ResponseEntity<String> createRoomType(RoomTypeDTO roomTypeDto) {

        return null;
    }

    @Override
    public ResponseEntity<String> addPictureToRoomType(String url, Long roomTypeID) {
        return null;
    }
}
