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

    private LaptopType laptopType;

    public LaptopDto(Integer id, String serialNumber, String maker, Integer price, String laptopType) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.laptopType = LaptopType.valueOf(laptopType);
    }

    public enum LaptopType {
        THIRTEEN("THIRTEEN"),
        FOURTEEN("FOURTEEN"),
        FIFTEEN("FIFTEEN"),
        SEVENTEEN("SEVENTEEN");

        private final String laptopType;

        LaptopType(String formFactor) {
            this.laptopType = formFactor;
        }

        @Override
        public String toString() {
            return this.laptopType;
        }
    }

}
