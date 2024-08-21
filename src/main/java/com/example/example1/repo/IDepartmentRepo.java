package com.example.example1.repo;

import com.example.example1.model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepo extends JpaRepository<DepartmentModel, Long> {
}
