package com.android.entity;

import java.io.Serializable;
import java.sql.Timestamp;

//文章类
public class Essay implements Serializable {
    private int essay_id;//文章编号
    private String user_id;//文章所属账号
    private String user_name;//文章所属账号昵称
    private String essay_title;//文章标题
    private String essay_content;//文章内容
    private Timestamp essay_create_date;//发表时间
    private int comments;

    public Essay() {

    }

    public Essay(String user_id, String essay_title, String essay_content, String user_name) {
        this.user_id = user_id;
        this.essay_title = essay_title;
        this.essay_content = essay_content;
        this.user_name = user_name;
        this.comments = comments;
        this.essay_create_date = new Timestamp(System.currentTimeMillis());

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(int essay_id) {
        this.essay_id = essay_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getEssay_title() {
        return essay_title;
    }

    public void setEssay_title(String essay_title) {
        this.essay_title = essay_title;
    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Timestamp getEssay_create_date() {
        return essay_create_date;
    }

    public void setEssay_create_date(Timestamp essay_create_date) {
        this.essay_create_date = essay_create_date;
    }
}
