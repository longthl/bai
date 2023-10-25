package com.example.bai8.controller;

import com.example.bai8.model.LoaiNguyenLieu;
import com.example.bai8.service.LoaiNguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loai-nguyen-lieu")
public class LoaiNguyenLieuController {
    @Autowired
    LoaiNguyenLieuService loaiNguyenLieuService;
    @PostMapping("/add")
    public String add(@RequestBody LoaiNguyenLieu loaiNguyenLieu){
        loaiNguyenLieuService.insert(loaiNguyenLieu);
        return "Thành công";
    }
}
