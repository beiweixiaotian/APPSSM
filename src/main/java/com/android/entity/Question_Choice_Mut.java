package com.android.entity;

import java.io.Serializable;

//多选题类
public class Question_Choice_Mut implements Serializable {
    private int q_id;//题目编号
    private int score;//得分
    private String q_content;//题干
    private String q_answer;//答案
    //答案内容
    private String q_a;
    private String q_b;
    private String q_c;
    private String q_d;
    //是否正确
    private boolean cur_a;
    private boolean cur_b;
    private boolean cur_c;
    private boolean cur_d;

    public Question_Choice_Mut() {
        this.score = 0;
    }

    public Question_Choice_Mut(int q_id, String q_content, String q_answer, String q_a, String q_b, String q_c, String q_d) {
        this.q_id = q_id;
        this.q_content = q_content;
        this.q_answer = q_answer;
        this.q_a = q_a;
        this.q_b = q_b;
        this.q_c = q_c;
        this.q_d = q_d;

    }

    public void addScore(){
        this.score++;
    }

    private void setAnswers(){
        String[] ans = this.q_answer.split(";");
        for(int i = 0; i < ans.length; i++){
            if(ans[i].equals("A")){
                cur_a = true;
                continue;
            }
            if(ans[i].equals("B")){
                cur_b = true;
                continue;
            }
            if(ans[i].equals("C")){
                cur_c = true;
                continue;
            }
            if(ans[i].equals("D")){
                cur_d = true;
                continue;
            }
        }
    }

    public boolean isCur_a() {
        return cur_a;
    }

    public void setCur_a(boolean cur_a) {
        this.cur_a = cur_a;
    }

    public boolean isCur_b() {
        return cur_b;
    }

    public void setCur_b(boolean cur_b) {
        this.cur_b = cur_b;
    }

    public boolean isCur_c() {
        return cur_c;
    }

    public void setCur_c(boolean cur_c) {
        this.cur_c = cur_c;
    }

    public boolean isCur_d() {
        return cur_d;
    }

    public void setCur_d(boolean cur_d) {
        this.cur_d = cur_d;
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
        setAnswers();
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
