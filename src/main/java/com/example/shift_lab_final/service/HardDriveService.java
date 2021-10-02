package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.HardDriveDto;
import com.example.shift_lab_final.repository.HardDriveRepository;
import com.example.shift_lab_final.service.entities.HardDriveEntity;
import com.example.shift_lab_final.service.mappers.HardDriveEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardDriveService {

    private final int DEFAULT_INSERT_COUNT = 1;
    @Autowired
    private HardDriveRepository hardDriveRepository;

    @Transactional
    public void add(HardDriveDto hardDriveDto) {
        List<HardDriveEntity> alreadyInserted = hardDriveRepository.findAll();
        for (HardDriveEntity entity : alreadyInserted) {
            if (HardDriveEntityMapper.mapEntity(entity).compareTo(hardDriveDto) == 0) {
                hardDriveRepository.delete(entity);
                hardDriveRepository.save(HardDriveEntityMapper.mapDto(hardDriveDto, entity.getCount() + 1));
                return;
            }
        }

        hardDriveRepository.save(HardDriveEntityMapper.mapDto(hardDriveDto, DEFAULT_INSERT_COUNT));
    }

    @Transactional
    public void update(HardDriveDto hardDriveDto) {
        hardDriveRepository.save(HardDriveEntityMapper.mapDto(hardDriveDto, DEFAULT_INSERT_COUNT));
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
