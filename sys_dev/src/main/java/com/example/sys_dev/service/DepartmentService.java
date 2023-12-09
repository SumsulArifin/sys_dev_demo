package com.example.sys_dev.service;
import com.example.sys_dev.entity.model.Department;
import com.example.sys_dev.entity.request.DepartmentDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface DepartmentService {

    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();
    public Department findDepartmentById(int deptId);
    public Optional<Department> updateDepartment(int deptId, DepartmentDTO departmentDTO);
    public void deleteDepartmentById(int deptId);



}
