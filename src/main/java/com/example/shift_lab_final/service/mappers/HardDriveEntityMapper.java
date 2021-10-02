package com.example.shift_lab_final.service.mappers;

import com.example.shift_lab_final.controller.dto.HardDriveDto;
import com.example.shift_lab_final.service.entities.HardDriveEntity;

public class HardDriveEntityMapper {

    public static HardDriveEntity mapDto(HardDriveDto dto, int count) {
        return new HardDriveEntity(
            dto.getId(),
            dto.getSerialNumber(),
            dto.getMaker(),
            dto.getPrice(),
            dto.getVolume(),
            count
        );
    }

    public static HardDriveDto mapEntity(HardDriveEntity entity) {
        return new HardDriveDto(
            entity.getId(),
            entity.getSerialNumber(),
            entity.getMaker(),
            entity.getPrice(),
            entity.getVolume(),
            entity.getCount()
        );
    }

}
