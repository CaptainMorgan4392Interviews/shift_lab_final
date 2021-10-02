package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    protected Integer id;

    protected String serialNumber;

    protected String maker;

    protected Integer price;

    protected Integer count;

}
