package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.PcDto;
import com.example.shift_lab_final.repository.PcRepository;
import com.example.shift_lab_final.service.mappers.PcEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PcService {

    @Autowired
    private PcRepository pcRepository;

    @Transactional
    public void add(PcDto pcDto) {
        pcRepository.save(PcEntityMapper.mapDto(pcDto));
    }

    @Transactional
    public void update(PcDto pcDto) {
    }

    public List<PcDto> getById(int id) {
        return pcRepository
            .findAllById(Collections.singletonList(id))
            .stream()
            .map(PcEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

    public List<PcDto> getByType() {
        return pcRepository.findAll()
            .stream()
            .map(PcEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

}
