package com.example.bai8.service.Impl;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.model.NguyenLieu;
import com.example.bai8.model.PhieuThu;
import com.example.bai8.repository.ChiTietPhieuThuRepository;
import com.example.bai8.repository.NguyenLieuRepository;
import com.example.bai8.repository.PhieuThuRepsotiry;
import com.example.bai8.service.ChiTietPhieuThuService;
import com.example.bai8.service.NguyenLieuService;
import com.example.bai8.service.PhieuThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PhieuThuServiceImpl implements PhieuThuService {
@Autowired
    PhieuThuRepsotiry phieuThuRepsotiry;
@Autowired
    NguyenLieuRepository nguyenLieuRepository;
@Autowired
    ChiTietPhieuThuRepository chiTietPhieuThuRepository;
@Autowired
    ChiTietPhieuThuService chiTietPhieuThuService;
@Autowired
    NguyenLieuService nguyenLieuService;

    @Override
    public void insert(PhieuThu phieuThu) {
        phieuThuRepsotiry.save(phieuThu);
    }

    @Override
    public void delete(int id) {
        chiTietPhieuThuRepository.deletect(id);
       phieuThuRepsotiry.deletept(id);
    }


    @Override
    public void thanhtien(int id,int nlid,int soluongban) {
        PhieuThu phieuThu=phieuThuRepsotiry.findById(id).orElse(null);
        NguyenLieu nguyenLieu=nguyenLieuRepository.findById(nlid).orElse(null);
        if(phieuThu !=null && nguyenLieu !=null){
           double thanhtien=nguyenLieu.getGiaBan() * soluongban;
           phieuThu.setThanhTien(thanhtien);
            phieuThuRepsotiry.save(phieuThu);
        }
    }

    @Override
    public List<PhieuThu> findByNgayLap(LocalDate ngayLap) {

       return phieuThuRepsotiry.findPhieuThuByNgayLap(ngayLap);
    }

    @Override
    public PhieuThu themmoi(PhieuThu phieuThu, List<ChiTietPhieuThu> chiTietPhieuThus) {
        PhieuThu phieuThu1=phieuThuRepsotiry.save(phieuThu);
        for(ChiTietPhieuThu pt: chiTietPhieuThus){
            int nguyenlieu=pt.getNguyenLieu().getId();
            NguyenLieu nguyenLieu=nguyenLieuRepository.findById(nguyenlieu).orElse(null);
            pt.setNguyenLieu(nguyenLieu);
            pt.setPhieuThu(phieuThu1);
            int soluongt=pt.getSoluongBan();
           double gia=nguyenLieu.getGiaBan();
            System.out.println(gia*soluongt);
           double tt=gia*soluongt;
           phieuThu1.setThanhTien(tt);
            chiTietPhieuThuService.insert(pt);
            nguyenLieuService.capnhap(nguyenlieu,-soluongt);
            phieuThuRepsotiry.save(phieuThu1);

        }
        return phieuThu1;
    }
}
