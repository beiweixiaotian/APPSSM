package com.android.service;

import com.android.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component
@Service
public interface UserService {
    public Map<String, Object> addUser(User user);
    public Map<String, Object> getAllUsers();
    public Map<String, Object> getUserById(int id);
    public Map<String, Object> getUserByPwd(int id, String pwd);
    public Map<String, Object> deleteUser(int id);
}
