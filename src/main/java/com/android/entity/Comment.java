package com.android.entity;

import java.sql.Timestamp;

//评论类
public class Comment {
    private int comment_id;//评论编号
    private int user_id;//评论所属账号
    private int essay_id;//评论所属文章
    private String user_name;//评论账号昵称
    private String comment_content;//评论内容
    private Timestamp com_create_date;//评论日期

    public Comment() {
    }

    public Comment(int user_id, int essay_id, String comment_content, String user_name) {
        this.user_id = user_id;
        this.essay_id = essay_id;
        this.comment_content = comment_content;
        this.user_name = user_name;
        this.com_create_date = new Timestamp(System.currentTimeMillis());

    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(int essay_id) {
        this.essay_id = essay_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Timestamp getCom_create_date() {
        return com_create_date;
    }

    public void setCom_create_date(Timestamp com_create_date) {
        this.com_create_date = com_create_date;
    }
}
