package com.example.bai8.controller;

import com.example.bai8.model.PhieuThu;
import com.example.bai8.model.phieuthukiemchitiet;
import com.example.bai8.service.PhieuThuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/phieu-thu")
public class PhieuThuController {
    @Autowired
    PhieuThuService phieuThuService;
    @PostMapping("/add")
    public String add(@RequestBody PhieuThu phieuThu){
        phieuThuService.insert(phieuThu);
        return "Thành công";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        phieuThuService.delete(id);
        return "Thành công";
    }
    @GetMapping("/timkiem/{ngayLap}")
    public List<PhieuThu> timkiem(@PathVariable("ngayLap")LocalDate ngayLap){
        List<PhieuThu> list=phieuThuService.findByNgayLap(ngayLap);
        return list;
    }
    @PostMapping("/themmoiphieuthu")
    public String themmoi(@RequestBody phieuthukiemchitiet phieuthukiemchitiet){
        phieuThuService.themmoi(phieuthukiemchitiet.getPhieuThu(),phieuthukiemchitiet.getChiTietPhieuThus());
        return "Thành công";
    }
}
