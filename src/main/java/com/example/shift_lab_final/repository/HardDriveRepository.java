package com.example.shift_lab_final.repository;

import com.example.shift_lab_final.service.entities.HardDriveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDriveRepository extends JpaRepository<HardDriveEntity, Integer> {
}
