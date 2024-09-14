package com.rs.nhahang.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date ngay;
    private int xacNhan;


    @ManyToOne
    @JoinColumn(name = "khachHangId" , nullable = false)
    private KhachHang khachHang;

    @ManyToMany
    Set<MonAn> monAns;


}
