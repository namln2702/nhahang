package com.rs.nhahang.service;

import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;
import org.springframework.stereotype.Service;

import java.util.List;



public interface danhMuc {
    public List<DanhMuc> getDanhMucs();
    public DanhMuc getDanhMuc(int id);
}
