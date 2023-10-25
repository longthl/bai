package com.example.bai8.repository;

import com.example.bai8.model.PhieuThu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PhieuThuRepsotiry extends JpaRepository<PhieuThu,Integer> {
    @Query("SELECT pt, ct.NguyenLieu.TenNguyenLieu FROM PhieuThu pt " +
            "JOIN ChiTietPhieuThu ct ON pt.id = ct.PhieuThu.id " +
            "JOIN NguyenLieu nl ON ct.NguyenLieu.id = nl.id " +
            "WHERE pt.NgayLap = :ngaylap")
    List<PhieuThu> findPhieuThuByNgayLap(@Param("ngaylap") LocalDate ngaylap);
@Query("delete from PhieuThu pt where pt.id =: id")
    void deletept(@Param("id")Integer id);
//@Query("select pt from PhieuThu pt where pt.NgayLap =: ngayLap and pt.id in" +
//        " (select PhieuThu from ChiTietPhieuThu ct where NguyenLieu in " +
//        "(select id from NguyenLieu ))")
//    List<PhieuThu> findByNgay(@Param("ngayLap")LocalDate ngayLap);
}
