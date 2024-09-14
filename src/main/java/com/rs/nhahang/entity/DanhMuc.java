package com.rs.nhahang.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "danh_muc")
public class DanhMuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String ten;

//    @OneToMany(targetEntity = MonAn.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "danhmuc_id", referencedColumnName = "id")
//    private Set<MonAn> monAns = new HashSet<>();

    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<MonAn> monAns;

}
