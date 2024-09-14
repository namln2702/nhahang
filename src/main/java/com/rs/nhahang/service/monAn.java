package com.rs.nhahang.service;

import com.rs.nhahang.dto.MonAnRequest;
import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;

import java.util.List;


public interface monAn {
    public List<MonAn> getMonAns();
    public void addMonAn(MonAnRequest monAnRequest);

}
