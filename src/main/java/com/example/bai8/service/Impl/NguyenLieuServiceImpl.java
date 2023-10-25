package com.example.bai8.service.Impl;

import com.example.bai8.model.NguyenLieu;
import com.example.bai8.repository.NguyenLieuRepository;
import com.example.bai8.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguyenLieuServiceImpl implements NguyenLieuService {
@Autowired
    NguyenLieuRepository nguyenLieuRepository;

    @Override
    public void insert(NguyenLieu nguyenLieu) {
        nguyenLieuRepository.save(nguyenLieu);
    }

    @Override
    public void capnhap(int id, int soluong) {
        NguyenLieu nl=nguyenLieuRepository.findById(id).orElse(null);
        if(nl != null){
            if(nl.getSoLuongKho()>0) {
                int soluongmoi = soluong + nl.getSoLuongKho();
                nl.setSoLuongKho(soluongmoi);
                nguyenLieuRepository.save(nl);
            }
        }
    }
}
