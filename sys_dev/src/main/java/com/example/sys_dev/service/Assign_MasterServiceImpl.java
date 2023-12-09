package com.example.sys_dev.service;
import com.example.sys_dev.entity.model.Assign_Master;
import com.example.sys_dev.entity.model.Department;
import com.example.sys_dev.repository.Assign_MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Assign_MasterServiceImpl implements Assign_MasterService{
    @Autowired
    Assign_MasterRepository assign_masterRepository;
    @Autowired
    DepartmentService departmentService;

    @Override
    public Assign_Master saveAssign_Master(Assign_Master assign_master){


        Department savedDepartment = departmentService.saveDepartment(assign_master.getDepartment());
        assign_master.setDepartment(savedDepartment);

        // Then save assign master
        return assign_masterRepository.save(assign_master);
    }


    @Override
    public List<Assign_Master> getAllAssign_Master() {
        return assign_masterRepository.findAll();
    }

    @Override
    public Assign_Master findAssign_MasterById(int a_M_Id) {
        return null;
    }

    @Override
    public void deleteAssign_MasterById(int a_M_Id) {

    }
    public Department findDepByA_M_Id(int a_M_Id) {
        return assign_masterRepository.findDepartmentByAMId(a_M_Id);
    }

}
