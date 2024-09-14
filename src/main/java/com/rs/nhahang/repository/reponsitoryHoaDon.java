package com.rs.nhahang.repository;

import com.rs.nhahang.entity.HoaDon;
import com.rs.nhahang.entity.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface reponsitoryHoaDon extends JpaRepository<HoaDon, Integer> {
}

