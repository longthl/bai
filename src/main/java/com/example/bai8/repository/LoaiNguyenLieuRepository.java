package com.example.bai8.repository;

import com.example.bai8.model.LoaiNguyenLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiNguyenLieuRepository extends JpaRepository<LoaiNguyenLieu,Integer> {
}
