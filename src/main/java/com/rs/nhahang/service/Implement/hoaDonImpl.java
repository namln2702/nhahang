package com.rs.nhahang.service.Implement;

import com.rs.nhahang.entity.HoaDon;
import com.rs.nhahang.entity.MonAn;
import com.rs.nhahang.repository.reponsitoryHoaDon;
import com.rs.nhahang.repository.reponsitoryMonAn;
import com.rs.nhahang.service.hoaDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hoaDonImpl implements hoaDon {

    @Autowired
    private reponsitoryHoaDon reponsitoryHoaDon;

    @Override
    public List<HoaDon> hoadons() {
        return reponsitoryHoaDon.findAll();
    }
}
