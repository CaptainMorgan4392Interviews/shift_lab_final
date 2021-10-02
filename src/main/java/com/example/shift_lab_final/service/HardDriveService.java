package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.HardDriveDto;
import com.example.shift_lab_final.repository.HardDriveRepository;
import com.example.shift_lab_final.service.mappers.HardDriveEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardDriveService {

    @Autowired
    private HardDriveRepository hardDriveRepository;

    @Transactional
    public void add(HardDriveDto hardDriveDto) {
        hardDriveRepository.save(HardDriveEntityMapper.mapDto(hardDriveDto));
    }

    @Transactional
    public void update(HardDriveDto hardDriveDto) {
    }

    public List<HardDriveDto> getById(int id) {
        return hardDriveRepository
            .findAllById(Collections.singletonList(id))
            .stream()
            .map(HardDriveEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

    public List<HardDriveDto> getByType() {
        return hardDriveRepository
            .findAll()
            .stream()
            .map(HardDriveEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

}
