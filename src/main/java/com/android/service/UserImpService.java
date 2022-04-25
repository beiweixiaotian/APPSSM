package com.android.service;

import com.android.dao.UserDao;
import com.android.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


@Service
public class UserImpService implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> addUser(User user) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", userDao.addUser(user));
        }
        catch (Exception e) {
            map.put("state",0);
            map.put("msg", "学号已注册");
        }
        return map;
    }

    @Override
    public Map<String, Object> getUserByPwd(String user_id, String pwd) {
        Map<String, Object> map = new TreeMap<>();
        User user;
        try{
            user = userDao.getUserById(user_id);
            if (user != null && user.getUser_pwd().equals(pwd)){
                map.put("state", 1);
                map.put("user", user);
            }
            else if (user == null){
                map.put("state", 0);
                map.put("msg", "用户不存在");
            }
            else if (!user.getUser_pwd().equals(pwd)){
                map.put("state", 0);
                map.put("msg", "密码错误");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            map.put("test", "异常");
        }
        return map;
    }

    @Override
    public Map<String, Object> getAllUsers() {
        Map<String, Object> map = new TreeMap<>();
        List<User> users;
        try{
            users = userDao.getAllUsers();
            if (users != null){
                map.put("state", 1);
                map.put("users", users);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> getUserById(String user_id) {
        Map<String, Object> map = new TreeMap<>();
        User user;
        try{
            user = userDao.getUserById(user_id);
            if (user != null){
                map.put("state", 1);
                map.put("name", user.getUser_name());
            }
            else {
                map.put("state", 0);
                map.put("msg", "无此用户");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteUser(String user_id) {
        Map<String, Object> map = new TreeMap<>();
        try{
            map.put("state", userDao.deleteUser(user_id));
        }
        catch (Exception e){
            map.put("state", 0);
        }
        return map;
    }
}
