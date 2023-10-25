package com.example.bai8.service;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.model.PhieuThu;

import java.time.LocalDate;
import java.util.List;

public interface ChiTietPhieuThuService {
    void insert(ChiTietPhieuThu chiTietPhieuThu);
    List<ChiTietPhieuThu> findByNgayLap(LocalDate ngayLap);
}
