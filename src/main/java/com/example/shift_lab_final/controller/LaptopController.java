package com.example.shift_lab_final.controller;

import com.example.shift_lab_final.controller.dto.LaptopDto;
import com.example.shift_lab_final.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store/laptop")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping(value = "/add")
    public void add(@ModelAttribute LaptopDto laptopDto) {
        laptopService.add(laptopDto);
    }

    @PatchMapping(value = "/update")
    public void update(@ModelAttribute LaptopDto laptopDto) {
        laptopService.update(laptopDto);
    }

}
