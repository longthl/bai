package com.example.bai8.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class phieuthukiemchitiet {
    private PhieuThu PhieuThu;
    private List<ChiTietPhieuThu>chiTietPhieuThus;
}
