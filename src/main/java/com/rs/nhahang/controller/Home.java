package com.rs.nhahang.controller;


import com.rs.nhahang.dto.MonAnRequest;
import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.HoaDon;
import com.rs.nhahang.entity.MonAn;
import com.rs.nhahang.service.Implement.cloudImpl;
import com.rs.nhahang.service.Implement.danhMucImpl;
import com.rs.nhahang.service.Implement.hoaDonImpl;
import com.rs.nhahang.service.Implement.monAnImpl;
import jakarta.servlet.annotation.MultipartConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:5500") // Cho phép từ origin này
@RequestMapping()
public class Home {

    @Autowired
    private cloudImpl cloudImpl;

    @Autowired
    private danhMucImpl danhMucImpl;

    @Autowired
    private monAnImpl monAnImpl;

    @Autowired
    private hoaDonImpl hoaDonImpl;

    @GetMapping("/danhmucs")
    public List<DanhMuc> layDanhMucs(){
        return danhMucImpl.getDanhMucs();
    }

    @GetMapping("/danhmuc")
    public DanhMuc layDanhMuc(@RequestParam int id){
        return danhMucImpl.getDanhMuc(id);
    }

    @GetMapping("/monans")
    public List<MonAn> MonAns(){
        return monAnImpl.getMonAns();
    }

    @GetMapping("/hoadons")
    public List<HoaDon> HoaDons(){
        return hoaDonImpl.hoadons();
    }

    @PostMapping("/cloud")
    public ResponseEntity<?> upload(@RequestPart("image") MultipartFile file, @RequestPart("data") MonAnRequest monAnRequest){

//        Map data = cloudImpl.upload(file, monAnRequest);
        return ResponseEntity.ok().body(monAnRequest);
    }

    @PostMapping("/monan")
    public ResponseEntity<?> saveMonAn(@RequestBody MonAnRequest monAnRequest){
        monAnImpl.addMonAn(monAnRequest);
        return ResponseEntity.ok().body(monAnImpl.getMonAns());
    }
}
