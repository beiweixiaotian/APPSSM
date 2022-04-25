package com.android.entity;

import java.io.Serializable;

//消息类
public class News implements Serializable {
    private int msg_id;//消息编号
    private String msg_from;//消息发送方
    private String msg_to;//消息接收方
    private String msg_content;//消息内容

    public News() {
    }

    public News(int msg_id, String msg_from, String msg_to, String msg_content) {
        this.msg_id = msg_id;
        this.msg_from = msg_from;
        this.msg_to = msg_to;
        this.msg_content = msg_content;
    }

    public News(String msg_from, String msg_to, String msg_content) {
        this.msg_from = msg_from;
        this.msg_to = msg_to;
        this.msg_content = msg_content;
    }

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public String getMsg_from() {
        return msg_from;
    }

    public void setMsg_from(String msg_from) {
        this.msg_from = msg_from;
    }

    public String getMsg_to() {
        return msg_to;
    }

    public void setMsg_to(String msg_to) {
        this.msg_to = msg_to;
    }

    public String getMsg_content() {
        return msg_content;
    }

    public void setMsg_content(String msg_content) {
        this.msg_content = msg_content;
    }
}
