package com.example.demo.controller;

import com.example.demo.dto.StaffDto;
import com.example.demo.entity.StaffEntity;
import com.example.demo.service.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/staff")
public class StaffController {
    StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("")
    public List<StaffEntity> getProduct(){
        return staffService.fetchAll();
    }

    @PostMapping("")
    public StaffEntity addProduct(@RequestBody StaffDto request) {
        return staffService.add(request);
    }
}
