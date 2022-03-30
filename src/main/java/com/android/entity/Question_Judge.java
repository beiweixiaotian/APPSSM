package com.android.entity;

import java.io.Serializable;

//判断题类
public class Question_Judge implements Serializable {
    private int q_id;//题目编号
    private int score;//得分
    private String q_content;//内容
    private String q_answer;//答案

    public Question_Judge() {
        this.score = 0;
    }

    public Question_Judge(int q_id, String q_content, String q_answer) {
        this.q_id = q_id;
        this.q_content = q_content;
        this.q_answer = q_answer;
    }

    public void addScore(){
        this.score++;
    }

    public Question_Judge(String q_content, String q_answer) {
        this.q_content = q_content;
        this.q_answer = q_answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQ_content() {
        return q_content;
    }

    public void setQ_content(String q_content) {
        this.q_content = q_content;
    }

    public String getQ_answer() {
        return q_answer;
    }

    public void setQ_answer(String q_answer) {
        this.q_answer = q_answer;
    }
}
