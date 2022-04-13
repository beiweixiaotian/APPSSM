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
        }
        return map;
    }

    @Override
    public Map<String, Object> getUserByPwd(int user_id, String pwd) {
        Map<String, Object> map = new TreeMap<>();
        User user;
        try{
            user = userDao.getUserByPwd(user_id, pwd);
            if (user != null){
                map.put("state", 1);
                map.put("user", user);
            }
            else {
                map.put("state", 0);
                map.put("msg", "用户名或密码错误");
            }
        }
        catch (Exception e){
            e.printStackTrace();
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
    public Map<String, Object> getUserById(int user_id) {
        Map<String, Object> map = new TreeMap<>();
        String name;
        try{
            name = userDao.getUserById(user_id);
            if (name != null){
                map.put("state", 1);
                map.put("name", name);
            }
            else {

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteUser(int id) {
        Map<String, Object> map = new TreeMap<>();
        try{
            map.put("state", userDao.deleteUser(id));
        }
        catch (Exception e){
            map.put("state", 0);
        }
        return map;
    }
}
