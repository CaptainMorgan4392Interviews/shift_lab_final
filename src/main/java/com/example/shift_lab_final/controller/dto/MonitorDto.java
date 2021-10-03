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
public class MonitorDto extends ProductDto implements Comparable<MonitorDto> {

    private Float diagonal;

    public MonitorDto(Integer id, String serialNumber, String maker, Integer price, Float diagonal, Integer count) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.diagonal = diagonal;
        this.count = count;
    }

    @Override
    public int compareTo(MonitorDto o) {
        boolean equals =
            Objects.equals(this.serialNumber, o.serialNumber) &&
                Objects.equals(this.maker, o.maker) &&
                Objects.equals(this.price, o.price) &&
                Objects.equals(this.diagonal, o.diagonal);

        if (equals) {
            return 0;
        }

        return 1;
    }
}
