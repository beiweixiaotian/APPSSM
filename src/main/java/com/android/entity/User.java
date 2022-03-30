package com.android.entity;

import java.io.Serializable;

//用户类
public class User implements Serializable {

    private int id;//用户编号
    private String user_name;//昵称
    private String user_pwd;//密码

    public User() {

    }

    public User(String user_name, String user_pwd) {
        this.user_pwd = user_pwd;
        this.user_name = user_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
