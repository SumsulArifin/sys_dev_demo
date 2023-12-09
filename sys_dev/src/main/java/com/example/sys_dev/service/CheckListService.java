package com.example.sys_dev.service;
import com.example.sys_dev.entity.model.CheckList;
import com.example.sys_dev.entity.request.CheckListDTO;
import com.example.sys_dev.utils.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface CheckListService {
    public MessageResponse saveCheckList(CheckListDTO checkListDTO);
    public List<CheckList> getAllCheckList();
    public CheckList findCheckListById(int sl);
    public Optional<CheckList> updateCheckList(int sl, CheckListDTO employeeDTO);
    public void deleteCheckListById(int sl);

    public void saveChecklists(List<CheckList> checkLists);
    public String generateAndSaveReport(List<CheckList> checkLists);
}
