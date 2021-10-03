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
public class PcDto extends ProductDto implements Comparable<PcDto> {

    private FormFactor formFactor;

    public PcDto(Integer id, String serialNumber, String maker, Integer price, String formFactor, Integer count) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.formFactor = FormFactor.valueOf(formFactor);
        this.count = count;
    }

    @Override
    public int compareTo(PcDto o) {
        boolean equals =
            Objects.equals(this.serialNumber, o.serialNumber) &&
                Objects.equals(this.maker, o.maker) &&
                Objects.equals(this.price, o.price) &&
                Objects.equals(this.formFactor, o.formFactor);

        if (equals) {
            return 0;
        }

        return 1;
    }

    public enum FormFactor {
        NETTOP("NETTOP"),
        MONOBLOCK("MONOBLOCK"),
        DESKTOP("DESKTOP");

        private final String formFactor;

        FormFactor(String formFactor) {
            this.formFactor = formFactor;
        }

        @Override
        public String toString() {
            return this.formFactor;
        }
    }

}
