package com.example.shift_lab_final.service.mappers;

import com.example.shift_lab_final.controller.dto.LaptopDto;
import com.example.shift_lab_final.service.entities.LaptopEntity;

public class LaptopEntityMapper {

    public static LaptopEntity mapDto(LaptopDto dto) {
        return new LaptopEntity(
            dto.getId(),
            dto.getSerialNumber(),
            dto.getMaker(),
            dto.getPrice(),
            dto.getLaptopType()
        );
    }

    public static LaptopDto mapEntity(LaptopEntity entity) {
        return new LaptopDto(
            entity.getId(),
            entity.getSerialNumber(),
            entity.getMaker(),
            entity.getPrice(),
            entity.getLaptopType()
        );
    }

}
