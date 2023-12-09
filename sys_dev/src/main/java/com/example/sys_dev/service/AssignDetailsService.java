package com.example.sys_dev.service;
import com.example.sys_dev.entity.model.AssignDetails;
import com.example.sys_dev.utils.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AssignDetailsService {
    public MessageResponse saveAssignDetails(AssignDetails assignDetails);
    public List<AssignDetails> getAllAssignDetails();
    public AssignDetails findAssignDetailsById(int a_M_Id);
    public void deleteAssignDetailsById(int a_M_Id);
    public AssignDetails findCheByA_M_Id(int a_M_Id);
    public List<AssignDetails> getCheckListsByAMId(int a_M_Id);

}
