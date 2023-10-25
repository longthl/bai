package com.example.bai8.service.Impl;

import com.example.bai8.model.LoaiNguyenLieu;
import com.example.bai8.repository.LoaiNguyenLieuRepository;
import com.example.bai8.service.LoaiNguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiNguyenLieuServiceImpl implements LoaiNguyenLieuService {
@Autowired
    LoaiNguyenLieuRepository loaiNguyenLieuRepository;

    @Override
    public void insert(LoaiNguyenLieu loaiNguyenLieu) {
        loaiNguyenLieuRepository.save(loaiNguyenLieu);
    }
}
