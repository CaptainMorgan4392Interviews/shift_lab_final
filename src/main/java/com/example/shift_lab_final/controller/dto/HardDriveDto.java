package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HardDriveDto extends ProductDto {

    private Integer volume;

    public HardDriveDto(Integer id, String serialNumber, String maker, Integer price, Integer volume) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.volume = volume;
    }

}
