package com.rs.nhahang.dto;

import com.rs.nhahang.entity.DanhMuc;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class MonAnRequest {

    private String ten;
    private String mota;
    private String url;
    private float gia;
    private int danhMucId;

}
