package com.example.shift_lab_final.controller;

import com.example.shift_lab_final.controller.dto.HardDriveDto;
import com.example.shift_lab_final.controller.dto.LaptopDto;
import com.example.shift_lab_final.controller.dto.MonitorDto;
import com.example.shift_lab_final.controller.dto.PcDto;
import com.example.shift_lab_final.controller.dto.ProductDto;
import com.example.shift_lab_final.facade.StoreFacade;
import com.example.shift_lab_final.service.HardDriveService;
import com.example.shift_lab_final.service.LaptopService;
import com.example.shift_lab_final.service.MonitorService;
import com.example.shift_lab_final.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/store")
public class DataController {

    @Autowired
    private StoreFacade storeFacade;

    @Autowired
    private MonitorService monitorService;

    @Autowired
    private LaptopService laptopService;

    @Autowired
    private HardDriveService hardDriveService;

    @Autowired
    private PcService pcService;

    @GetMapping(value = "/getById/{id}")
    public ProductDto getById(@PathVariable String id) {
        return storeFacade.getById(Integer.parseInt(id));
    }

    @GetMapping(value = "/getByType/harddrive")
    public List<HardDriveDto> getHarddrives() {
        return hardDriveService.getByType();
    }

    @GetMapping(value = "/getByType/laptop")
    public List<LaptopDto> getLaptops() {
        return laptopService.getByType();
    }

    @GetMapping(value = "/getByType/monitor")
    public List<MonitorDto> getMonitors() {
        return monitorService.getByType();
    }

    @GetMapping(value = "/getByType/pc")
    public List<PcDto> getPcs() {
        return pcService.getByType();
    }

}
