package com.android.entity;

import java.io.Serializable;

//单选题类
public class Question_Choice implements Serializable {
    private int q_id;//选择题编号
    private String q_content;//题干描述
    private String q_answer;//答案
    private int score;//本题得分
    //答案内容
    private String q_a;
    private String q_b;
    private String q_c;
    private String q_d;

    public Question_Choice() {
        this.score = 0;
    }

    public Question_Choice(int q_id, String q_content, String q_answer, String q_a, String q_b, String q_c, String q_d) {
        this.q_id = q_id;
        this.q_content = q_content;
        this.q_answer = q_answer;
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(){
        this.score++;
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

    public String getQ_a() {
        return q_a;
    }

    public void setQ_a(String q_a) {
        this.q_a = q_a;
    }

    public String getQ_b() {
        return q_b;
    }

    public void setQ_b(String q_b) {
        this.q_b = q_b;
    }

    public String getQ_c() {
        return q_c;
    }

    public void setQ_c(String q_c) {
        this.q_c = q_c;
    }

    public String getQ_d() {
        return q_d;
    }

    public void setQ_d(String q_d) {
        this.q_d = q_d;
    }
}
