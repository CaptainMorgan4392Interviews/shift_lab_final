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

    private FormFactor formFactor;

    public PcDto(Integer id, String serialNumber, String maker, Integer price, String formFactor) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.maker = maker;
        this.price = price;
        this.formFactor = FormFactor.valueOf(formFactor);
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
