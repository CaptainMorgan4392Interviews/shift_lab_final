package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PcDto extends ProductDto {

    private String formFactor;

    public PcDto(Integer id, String serialNumber, String maker, Integer price, String formFactor) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.formFactor = formFactor;
    }

}
