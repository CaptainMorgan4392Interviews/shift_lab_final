package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.LaptopDto;
import com.example.shift_lab_final.repository.LaptopRepository;
import com.example.shift_lab_final.service.mappers.LaptopEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Transactional
    public void add(LaptopDto laptopDto) {
        laptopRepository.save(LaptopEntityMapper.mapDto(laptopDto));
    }

    @Transactional
    public void update(LaptopDto laptopDto) {
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
