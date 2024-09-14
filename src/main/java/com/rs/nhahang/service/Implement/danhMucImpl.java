package com.rs.nhahang.service.Implement;

import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;
import com.rs.nhahang.repository.reponsitoryDanhMuc;
import com.rs.nhahang.service.danhMuc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class danhMucImpl implements danhMuc {

    @Autowired
    private reponsitoryDanhMuc reponsitoryDanhMuc;
    @Override
    public List<DanhMuc> getDanhMucs() {
        List<DanhMuc> save =  reponsitoryDanhMuc.findAll();

        return save;


    }

    @Override
    public DanhMuc getDanhMuc(int id) {
        Optional<DanhMuc> danhmuc = reponsitoryDanhMuc.findById(id);

        return danhmuc.get();
    }

}
