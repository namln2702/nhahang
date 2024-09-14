package com.rs.nhahang.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity(name = "mon_an")
public class MonAn {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String url;
    private String ten;
    private String mota;
    private float gia;



    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "danhMucId", nullable = false)
    private DanhMuc danhMuc;


}
