package com.example.shift_lab_final.service.mappers;

import com.example.shift_lab_final.controller.dto.PcDto;
import com.example.shift_lab_final.service.entities.PcEntity;

public class PcEntityMapper {

    public static PcEntity mapDto(PcDto dto) {
        return new PcEntity(
            dto.getId(),
            dto.getSerialNumber(),
            dto.getMaker(),
            dto.getPrice(),
            dto.getFormFactor()
        );
    }

    public static PcDto mapEntity(PcEntity entity) {
        return new PcDto(
            entity.getId(),
            entity.getSerialNumber(),
            entity.getMaker(),
            entity.getPrice(),
            entity.getFormFactor()
        );
    }

}
