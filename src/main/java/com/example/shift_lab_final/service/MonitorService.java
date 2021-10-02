package com.example.shift_lab_final.service;

import com.example.shift_lab_final.controller.dto.MonitorDto;
import com.example.shift_lab_final.repository.MonitorRepository;
import com.example.shift_lab_final.service.mappers.MonitorEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    @Transactional
    public void add(MonitorDto monitorDto) {
        monitorRepository.save(MonitorEntityMapper.mapDto(monitorDto));
    }

    @Transactional
    public void update(MonitorDto monitorDto) {
    }

    public List<MonitorDto> getById(int id) {
        return monitorRepository
            .findAllById(Collections.singletonList(id))
            .stream()
            .map(MonitorEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

    public List<MonitorDto> getByType() {
        return monitorRepository.findAll()
            .stream()
            .map(MonitorEntityMapper::mapEntity)
            .collect(Collectors.toList());
    }

}
