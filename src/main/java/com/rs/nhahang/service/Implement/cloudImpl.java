package com.rs.nhahang.service.Implement;

import com.cloudinary.Cloudinary;
import com.rs.nhahang.dto.MonAnRequest;
import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;
import com.rs.nhahang.repository.reponsitoryDanhMuc;
import com.rs.nhahang.repository.reponsitoryMonAn;
import com.rs.nhahang.service.cloud;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class cloudImpl implements cloud{
    private final Cloudinary cloudinary;


    @Autowired
    private reponsitoryDanhMuc reponsitoryDanhMuc;

    @Autowired
    private reponsitoryMonAn reponsitoryMonAn;

    @Override
    public Map upload(MultipartFile file, MonAnRequest monAnRequest) {

        try{

            Optional danhMuc = reponsitoryDanhMuc.findById(monAnRequest.getDanhMucId());
            String tenDanhMuc = "";

            DanhMuc danhmucSave = new DanhMuc();

            if(danhMuc.isPresent()){
                danhmucSave = (DanhMuc) danhMuc.get();

                tenDanhMuc = danhmucSave.getTen();
            }
            else{
                throw new RuntimeException();
            }


//          upload file
            HashMap<Object, Object> options = new HashMap<>();
            options.put("folder",tenDanhMuc);
            Map data = cloudinary.uploader().upload(file.getBytes(),options);

//          chen url
            MonAn monAn = new MonAn();

            monAn.setMota(monAnRequest.getMota());
            monAn.setTen(monAnRequest.getTen());
            monAn.setGia(monAnRequest.getGia());
            monAn.setUrl((String) data.get("url"));

            danhmucSave.getMonAns().add(monAn);

            reponsitoryDanhMuc.save(danhmucSave);
            return data;
        }catch (IOException io){
            throw new RuntimeException("Image upload fail");
        }
    }
}
