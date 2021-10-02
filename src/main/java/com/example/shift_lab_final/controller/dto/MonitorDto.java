package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonitorDto extends ProductDto {

    private Float diagonal;

    public MonitorDto(Integer id, String serialNumber, String maker, Integer price, Float diagonal) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.diagonal = diagonal;
    }

}
