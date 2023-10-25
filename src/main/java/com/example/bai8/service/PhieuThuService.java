package com.example.bai8.service;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.model.PhieuThu;

import java.time.LocalDate;
import java.util.List;

public interface PhieuThuService {
    void insert(PhieuThu phieuThu);
    void delete(int id);
    void thanhtien(int id,int nlid,int soluongban);
    List<PhieuThu> findByNgayLap(LocalDate ngayLap);
    PhieuThu themmoi(PhieuThu phieuThu,List<ChiTietPhieuThu> chiTietPhieuThus);
}
