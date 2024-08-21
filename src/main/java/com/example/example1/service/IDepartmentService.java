package com.example.example1.service;

import com.example.example1.model.DepartmentModel;
import org.springframework.stereotype.Service;

@Service
public interface IDepartmentService {
    DepartmentModel createDepartment(DepartmentModel department);
}
