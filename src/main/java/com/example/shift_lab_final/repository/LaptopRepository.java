package com.example.shift_lab_final.repository;

import com.example.shift_lab_final.service.entities.LaptopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<LaptopEntity, Integer> {
}
