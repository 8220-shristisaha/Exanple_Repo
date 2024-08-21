package com.example.example1.controller;

import com.example.example1.model.DepartmentModel;
import com.example.example1.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired(required = true)
    IDepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<DepartmentModel> createDepartment(@RequestBody DepartmentModel department){
        DepartmentModel data = departmentService.createDepartment(department);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }
}
