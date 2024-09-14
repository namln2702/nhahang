package com.rs.nhahang.service;

import com.rs.nhahang.dto.MonAnRequest;
import com.rs.nhahang.entity.DanhMuc;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;


public interface cloud {
    public Map upload(MultipartFile file, MonAnRequest monAnRequest);
}
