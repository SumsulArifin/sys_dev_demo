package com.example.sys_dev.restController;

import com.example.sys_dev.entity.User;
import com.example.sys_dev.entity.model.AssignDetails;
import com.example.sys_dev.service.UserService;
import com.example.sys_dev.utils.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

@Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<MessageResponse> saveUser(@RequestBody User user) {
        MessageResponse response = userService.saveUser(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}
