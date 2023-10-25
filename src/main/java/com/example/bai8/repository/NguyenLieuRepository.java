package com.example.bai8.repository;

import com.example.bai8.model.NguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguyenLieuRepository extends JpaRepository<NguyenLieu,Integer> {
}
