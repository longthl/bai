package com.example.bai8.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name="PhieuThu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhieuThu {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PhieuThuId")
    private int id;
@Column(name="NgayLap")
    private LocalDate NgayLap;
@Column(name="NhanVienLap")
    private String NhanVienLap;
@Column(name="GhiChu")
    private String GhiChu;
@Column(name="ThanhTien")
    private double ThanhTien;
}
