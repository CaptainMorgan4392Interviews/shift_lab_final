package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto extends ProductDto {

    private String laptopType;

    public LaptopDto(Integer id, String serialNumber, String maker, Integer price, String laptopType) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.laptopType = laptopType;
    }

}
