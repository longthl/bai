package com.example.bai8.controller;

import com.example.bai8.model.ChiTietPhieuThu;
import com.example.bai8.model.PhieuThu;
import com.example.bai8.service.ChiTietPhieuThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/chi-tiet-phieu")
public class ChiTietPhieuThuController {
    @Autowired
    ChiTietPhieuThuService chiTietPhieuThuService;
    @PostMapping("/add")
    public String add(@RequestBody ChiTietPhieuThu chiTietPhieuThu){
        chiTietPhieuThuService.insert(chiTietPhieuThu);
        return "thành công";
    }
    @GetMapping("/timkiem/{ngayLap}")
    public List<ChiTietPhieuThu> timkiem(@PathVariable("ngayLap") LocalDate ngayLap){
        List<ChiTietPhieuThu> list=chiTietPhieuThuService.findByNgayLap(ngayLap);
        return list;
    }
}
