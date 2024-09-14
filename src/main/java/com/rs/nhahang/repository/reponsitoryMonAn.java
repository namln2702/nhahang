package com.rs.nhahang.repository;

import com.rs.nhahang.entity.DanhMuc;
import com.rs.nhahang.entity.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface reponsitoryMonAn extends JpaRepository<MonAn, Integer> {
}

