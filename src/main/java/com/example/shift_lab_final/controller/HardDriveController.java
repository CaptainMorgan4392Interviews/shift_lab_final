package com.example.shift_lab_final.controller;

import com.example.shift_lab_final.controller.dto.HardDriveDto;
import com.example.shift_lab_final.service.HardDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store/harddrive")
public class HardDriveController {

    @Autowired
    private HardDriveService hardDriveService;

    @PostMapping(value = "/add")
    public void add(@ModelAttribute HardDriveDto hardDriveDto) {
        hardDriveService.add(hardDriveDto);
    }

    @PatchMapping(value = "/update")
    public void update(@ModelAttribute HardDriveDto hardDriveDto) {
        hardDriveService.update(hardDriveDto);
    }

}
