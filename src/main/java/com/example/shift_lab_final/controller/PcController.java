package com.example.shift_lab_final.controller;

import com.example.shift_lab_final.controller.dto.PcDto;
import com.example.shift_lab_final.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store/pc")
public class PcController {

    @Autowired
    private PcService pcService;

    @PostMapping(value = "/add")
    public void add(@ModelAttribute PcDto pcDto) {
        pcService.add(pcDto);
    }

    @PatchMapping(value = "/update")
    public void update(@ModelAttribute PcDto pcDto) {
        pcService.update(pcDto);
    }

}
