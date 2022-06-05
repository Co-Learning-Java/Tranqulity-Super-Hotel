package com.colearningjava.tranquilitysuperhotel.repository;

import com.colearningjava.tranquilitysuperhotel.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
