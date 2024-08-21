package com.example.example1.service;

import com.example.example1.model.DepartmentModel;
import com.example.example1.repo.IDepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements IDepartmentService{

    @Autowired
    IDepartmentRepo departmentRepo;

    @Override
    public DepartmentModel createDepartment(DepartmentModel department) {
        DepartmentModel data = departmentRepo.save(department);
        return data;
    }
}
