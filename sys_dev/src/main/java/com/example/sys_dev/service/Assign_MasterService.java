package com.example.sys_dev.service;
import com.example.sys_dev.entity.model.Assign_Master;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Assign_MasterService {
    public Assign_Master saveAssign_Master(Assign_Master assign_master);
    public List<Assign_Master> getAllAssign_Master();
    public Assign_Master findAssign_MasterById(int a_M_Id);
    public void deleteAssign_MasterById(int a_M_Id);
}
