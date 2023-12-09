package com.example.sys_dev.restController;
import com.example.sys_dev.entity.model.AssignDetails;
import com.example.sys_dev.service.AssignDetailsService;
import com.example.sys_dev.utils.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignDetails")
@CrossOrigin(originPatterns = {"*"})
public class AssignDetailsController {
    @Autowired
    AssignDetailsService assignDetailsService;
    @PostMapping("/a_d_save")
    public ResponseEntity<MessageResponse> saveA_D(@RequestBody AssignDetails assignDetails) {
        MessageResponse response = assignDetailsService.saveAssignDetails(assignDetails);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/getAllA_D")
    @ResponseBody
    public ResponseEntity<List<AssignDetails>> getAllAssignDetails() {
        List<AssignDetails> assignDetails = assignDetailsService.getAllAssignDetails();
        return new ResponseEntity<>(assignDetails, HttpStatus.OK);
    }

//    @GetMapping("/getCheckListBy/{a_M_Id}")
//    public ResponseEntity <List<AssignDetails>> getCById(@PathVariable("a_M_Id") Integer a_M_Id) {
//        List<AssignDetails> assignDetails = assignDetailsService.findCheByA_M_Id(a_M_Id);
//        return new ResponseEntity<>(assignDetails, HttpStatus.OK);
//    }

    @GetMapping("/findByAMId/{a_M_Id}")
    public AssignDetails findCheckListsByAMId(@PathVariable int a_M_Id) {
        return assignDetailsService.findCheByA_M_Id(a_M_Id);
    }

    @GetMapping("/checklists/{a_M_Id}")
    public List<AssignDetails> getCheckListsByAMId(@PathVariable("a_M_Id") int a_M_Id) {
        return assignDetailsService.getCheckListsByAMId(a_M_Id);
    }
}
