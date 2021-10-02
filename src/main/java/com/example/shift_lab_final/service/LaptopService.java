package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.LaptopDto;
import com.example.shift_lab_final.repository.LaptopRepository;
import com.example.shift_lab_final.service.entities.LaptopEntity;
import com.example.shift_lab_final.service.mappers.LaptopEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopService {

    private final int DEFAULT_INSERT_COUNT = 1;
    @Autowired
    private LaptopRepository laptopRepository;

    @Transactional
    public void add(LaptopDto laptopDto) {
        List<LaptopEntity> alreadyInserted = laptopRepository.findAll();
        for (LaptopEntity entity : alreadyInserted) {
            if (LaptopEntityMapper.mapEntity(entity).compareTo(laptopDto) == 0) {
                laptopRepository.delete(entity);
                laptopRepository.save(LaptopEntityMapper.mapDto(laptopDto, entity.getCount() + 1));
                return;
            }
        }

        laptopRepository.save(LaptopEntityMapper.mapDto(laptopDto, DEFAULT_INSERT_COUNT));
    }

    @Transactional
    public void update(LaptopDto laptopDto) {
        laptopRepository.save(LaptopEntityMapper.mapDto(laptopDto, DEFAULT_INSERT_COUNT));
    }

    public List<LaptopDto> getById(int id) {
        return laptopRepository
            .findAllById(Collections.singletonList(id))
            .stream()
            .map(LaptopEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

    public List<LaptopDto> getByType() {
        return laptopRepository.findAll()
            .stream()
            .map(LaptopEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

}
