package com.colearningjava.tranquilitysuperhotel.repository;

import com.colearningjava.tranquilitysuperhotel.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}