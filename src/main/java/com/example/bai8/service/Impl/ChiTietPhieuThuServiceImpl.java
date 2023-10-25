package com.example.bai8.service.Impl;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.repository.ChiTietPhieuThuRepository;
import com.example.bai8.service.ChiTietPhieuThuService;
import com.example.bai8.service.NguyenLieuService;
import com.example.bai8.service.PhieuThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ChiTietPhieuThuServiceImpl implements ChiTietPhieuThuService {
@Autowired
    ChiTietPhieuThuRepository chiTietPhieuThuRepository;

    @Override
    public void insert(ChiTietPhieuThu chiTietPhieuThu) {
        chiTietPhieuThuRepository.save(chiTietPhieuThu);
//        int nguyenLieu=chiTietPhieuThu.getNguyenLieu().getId();
//        int soLuongBan=chiTietPhieuThu.getSoluongBan();
//        nguyenLieuService.capnhap(nguyenLieu,-soLuongBan);
//        int phieuThu=chiTietPhieuThu.getPhieuThu().getId();
//        phieuThuService.thanhtien(phieuThu,nguyenLieu,soLuongBan);
    }
    @Override
    public List<ChiTietPhieuThu> findByNgayLap(LocalDate ngayLap) {
        return chiTietPhieuThuRepository.findPhieuThuByNgayLap(ngayLap);
    }
}
