package com.example.bai8.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Table(name = "NguyenLieu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NguyenLieuId")
    private int id;
    @Column(name = "TenNguyenLieu")
    @Size(max = 20,message = "Không quá 20 kí tự")
    private String TenNguyenLieu;
    @Column(name = "GiaBan")
    private double GiaBan;
    @Column(name = "DonViTinh")
    private String DonViTinh;
    @Column(name = "SoLuongKho")
    private int SoLuongKho;
    @ManyToOne
    @JoinColumn(name = "LoaiNguyenLieuId")
    private LoaiNguyenLieu LoaiNguyenLieu;
}
