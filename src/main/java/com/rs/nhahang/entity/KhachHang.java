package com.rs.nhahang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "khach_hang")
public class KhachHang {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String ten;
    private String sdt;
    private String userName;
    private String passWord;
    private float tichluy;

    @OneToMany(mappedBy = "khachHang")
    Set<HoaDon> hoaDons;



}
