package com.android.controller;

import com.android.entity.User;
import com.android.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/android/addUser")
    public Map<String, Object> addUser(User user) {
        return userService.addUser(user);
    }

//    @RequestMapping("/android/getUserByPwd")
//    public Map<String, Object> getUserByPwd(int user_id, String pwd) {
//        return userService.getUserByPwd(user_id, pwd);
//    }

    @RequestMapping("/android/getUserById")
    public Map<String, Object> getUserById(String user_id){
        return userService.getUserById(user_id);
    }

    @RequestMapping("/android/getAllUsers")
    public Map<String, Object> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping("/android/deleteUser")
    public Map<String, Object> deleteUser(String user_id){
        return userService.deleteUser(user_id);
    }

}
