package com.rs.nhahang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "nhan_vien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String ten;
    private String userName;
    private String passWord;



}
