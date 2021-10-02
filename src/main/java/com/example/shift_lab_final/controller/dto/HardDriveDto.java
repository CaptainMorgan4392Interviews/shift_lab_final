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
public class HardDriveDto extends ProductDto implements Comparable<HardDriveDto> {

    private Integer volume;

    public HardDriveDto(Integer id, String serialNumber, String maker, Integer price, Integer volume, Integer count) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.volume = volume;
        this.count = count;
    }

    @Override
    public int compareTo(HardDriveDto o) {
        boolean equals =
            Objects.equals(this.serialNumber, o.serialNumber) &&
                Objects.equals(this.maker, o.maker) &&
                Objects.equals(this.price, o.price) &&
                Objects.equals(this.volume, o.volume);

        if (equals) {
            return 0;
        }

        return 1;
    }
}
