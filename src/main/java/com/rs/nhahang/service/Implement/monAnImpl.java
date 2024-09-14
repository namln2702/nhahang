package com.rs.nhahang.service.Implement;

import com.rs.nhahang.dto.MonAnRequest;
import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;
import com.rs.nhahang.repository.reponsitoryDanhMuc;
import com.rs.nhahang.repository.reponsitoryMonAn;
import com.rs.nhahang.service.monAn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class monAnImpl implements monAn {

    @Autowired
    private reponsitoryMonAn reponsitoryMonAn;

    @Autowired
    private reponsitoryDanhMuc reponsitoryDanhMuc;

    @Override
    public List<MonAn> getMonAns(){
        return reponsitoryMonAn.findAll();
    }

    @Override
    public void addMonAn(MonAnRequest monAnRequest) {
        MonAn monAn = new MonAn();

        monAn.setUrl(monAnRequest.getUrl());
        monAn.setGia(monAnRequest.getGia());
        monAn.setTen(monAnRequest.getTen());
        monAn.setMota(monAnRequest.getMota());

        reponsitoryMonAn.save(monAn);

    }
}
