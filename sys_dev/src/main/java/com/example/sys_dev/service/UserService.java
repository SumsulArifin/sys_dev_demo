package com.example.sys_dev.service;

import com.example.sys_dev.entity.User;
import com.example.sys_dev.entity.model.AssignDetails;
import com.example.sys_dev.repository.UserRepository;
import com.example.sys_dev.utils.Message;
import com.example.sys_dev.utils.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public MessageResponse saveUser(User user) {
        User  user1=new User();

user1.setName(user.getName());
user1.setEmail(user.getEmail());
user1.setRole(user.getRole());
user1.setPassword(user.getPassword());
      userRepository.save(user1);
        return new MessageResponse(Message.SUCCESS);
    }
}
