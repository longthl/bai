package com.example.bai8.controller;

import com.example.bai8.model.NguyenLieu;
import com.example.bai8.service.NguyenLieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nguyen-lieu")
public class NguyenLieuController {
    @Autowired
    NguyenLieuService nguyenLieuService;
    @PostMapping("/add")
    public String add(@RequestBody NguyenLieu nguyenLieu){
        nguyenLieuService.insert(nguyenLieu);
        return "Thành công";
    }
}
