package com.colearningjava.tranquilitysuperhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageUrlRepository extends JpaRepository<ImageUrlRepository, Long> {
}
