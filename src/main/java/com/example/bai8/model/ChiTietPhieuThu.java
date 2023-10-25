package com.example.bai8.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ChiTietPhieuThu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChiTietPhieuThu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChiTietPhieuThuId")
    private int id;
    @Column(name = "SoLuongBan")
    private int SoluongBan;
    @ManyToOne
    @JoinColumn(name="NguyenLieuId")
    private NguyenLieu NguyenLieu;
    @ManyToOne
    @JoinColumn(name="PhieuThuId")
    private PhieuThu PhieuThu;
}
