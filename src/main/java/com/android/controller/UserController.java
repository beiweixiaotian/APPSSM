package com.android.controller;

import com.android.entity.User;
import com.android.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RestController
@RequestMapping("/android")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public Map<String, Object> addUser(User user) {
        return userService.addUser(user);
    }

    @RequestMapping("/getUserByPwd")
    public Map<String, Object> getUserByPwd(int id, String pwd) {
        return userService.getUserByPwd(id, pwd);
    }

    @RequestMapping("/getUserById")
    public Map<String, Object> getUserById(int id){
        return userService.getUserById(id);
    }

    @RequestMapping("/getAllUsers")
    public Map<String, Object> getAllUsers(){return userService.getAllUsers();};

    @RequestMapping("/deleteUser")
    public Map<String, Object> deleteUser(int user_id){return userService.deleteUser(user_id);};

}
