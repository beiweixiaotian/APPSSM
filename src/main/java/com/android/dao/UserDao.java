package com.android.dao;
import com.android.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface UserDao{

    @Insert("insert into users (user_name, user_pwd) values(#{user_name}, #{user_pwd})")
    int addUser(User user);

    @Select("select * from users")
    List<User> getAllUsers();

    @Select("select user_name from users where user_id = #{user_id}")
    String getUserById(int user_id);

    @Select("select * from users where user_id = #{user_id} and user_pwd = #{user_pwd}")
    User getUserByPwd(int user_id, String user_pwd);

    @Delete("delete from users where user_id = #{user_id}")
    int deleteUser(int user_id);

}
