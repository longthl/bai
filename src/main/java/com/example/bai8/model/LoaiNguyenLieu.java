package com.example.bai8.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="LoaiNguyenLieu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoaiNguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LoaiNguyenLieuId")
    private int id;
    @Column(name = "TenLoai")
    @Size(max = 20,message = "Không quá 20 kí tự")
    private String TenLoai;
    @Column(name = "MoTa")
    private String MoTa;
}
