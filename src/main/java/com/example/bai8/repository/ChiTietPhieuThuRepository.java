package com.example.bai8.repository;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.model.PhieuThu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ChiTietPhieuThuRepository extends JpaRepository<ChiTietPhieuThu,Integer> {
@Query("delete from ChiTietPhieuThu ctpt where ctpt.PhieuThu.id =: id")
void deletect(@Param("id")Integer id);
    @Query("SELECT  ct , nl.TenNguyenLieu,pt FROM PhieuThu pt " +
            "JOIN ChiTietPhieuThu ct ON pt.id = ct.PhieuThu.id " +
            "JOIN NguyenLieu nl ON ct.NguyenLieu.id = nl.id " +
            "WHERE pt.NgayLap = :ngaylap")
    List<ChiTietPhieuThu> findPhieuThuByNgayLap(@Param("ngaylap") LocalDate ngaylap);
}
