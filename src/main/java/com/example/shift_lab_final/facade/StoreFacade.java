package com.example.shift_lab_final.facade;

import com.example.shift_lab_final.controller.dto.ProductDto;
import com.example.shift_lab_final.service.HardDriveService;
import com.example.shift_lab_final.service.LaptopService;
import com.example.shift_lab_final.service.MonitorService;
import com.example.shift_lab_final.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class StoreFacade {

    @Autowired
    private PcService pcService;

    @Autowired
    private MonitorService monitorService;

    @Autowired
    private HardDriveService hardDriveService;

    @Autowired
    private LaptopService laptopService;

    public ProductDto getById(int id) {
        Stream<ProductDto> dtoFinder = Stream.<ProductDto>builder().build();

        dtoFinder = Stream.concat(dtoFinder, pcService.getById(id).stream());
        dtoFinder = Stream.concat(dtoFinder, monitorService.getById(id).stream());
        dtoFinder = Stream.concat(dtoFinder, hardDriveService.getById(id).stream());
        dtoFinder = Stream.concat(dtoFinder, laptopService.getById(id).stream());

        List<ProductDto> finalList = dtoFinder.collect(Collectors.toList());
        if (finalList.isEmpty()) {
            return null;
        }
        return finalList.get(0);
    }

}
