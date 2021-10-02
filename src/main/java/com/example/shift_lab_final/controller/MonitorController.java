package com.example.shift_lab_final.controller;

import com.example.shift_lab_final.controller.dto.MonitorDto;
import com.example.shift_lab_final.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store/monitor")
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @PostMapping(value = "/add")
    public void add(@ModelAttribute MonitorDto monitorDto) {
        monitorService.add(monitorDto);
    }

    @PatchMapping(value = "/update")
    public void update(@ModelAttribute MonitorDto monitorDto) {
        monitorService.update(monitorDto);
    }

}
