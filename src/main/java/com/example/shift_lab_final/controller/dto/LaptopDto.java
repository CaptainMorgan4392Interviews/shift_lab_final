package com.example.shift_lab_final.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaptopDto extends ProductDto implements Comparable<LaptopDto> {

    private LaptopType laptopType;

    public LaptopDto(Integer id, String serialNumber, String maker, Integer price, String laptopType, Integer count) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.laptopType = LaptopType.valueOf(laptopType);
        this.count = count;
    }

    @Override
    public int compareTo(LaptopDto o) {
        boolean equals =
            Objects.equals(this.id, o.id) &&
                Objects.equals(this.serialNumber, o.serialNumber) &&
                Objects.equals(this.maker, o.maker) &&
                Objects.equals(this.price, o.price) &&
                Objects.equals(this.laptopType, o.laptopType);

        if (equals) {
            return 0;
        }

        return 1;
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
