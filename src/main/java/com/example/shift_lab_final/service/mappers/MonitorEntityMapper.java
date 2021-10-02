package com.example.shift_lab_final.service.mappers;

import com.example.shift_lab_final.controller.dto.MonitorDto;
import com.example.shift_lab_final.service.entities.MonitorEntity;

public class MonitorEntityMapper {

    public static MonitorEntity mapDto(MonitorDto dto) {
        return new MonitorEntity(
            dto.getId(),
            dto.getSerialNumber(),
            dto.getMaker(),
            dto.getPrice(),
            dto.getDiagonal()
        );
    }

    public static MonitorDto mapEntity(MonitorEntity entity) {
        return new MonitorDto(
            entity.getId(),
            entity.getSerialNumber(),
            entity.getMaker(),
            entity.getPrice(),
            entity.getDiagonal()
        );
    }

}
