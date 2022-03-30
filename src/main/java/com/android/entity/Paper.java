package com.android.entity;

//试题类
public class Paper {
    private int user_id;//答题人编号
    private int paper_id;//试题编号
    private String paper_content;//试题内容
    private int paper_score;//试题分数
    public Paper() {
    }
    public int getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(int paper_id) {
        this.paper_id = paper_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPaper_content() {
        return paper_content;
    }

    public void setPaper_content(String paper_content) {
        this.paper_content = paper_content;
    }

    public int getPaper_score() {
        return paper_score;
    }

    public void setPaper_score(int paper_score) {
        this.paper_score = paper_score;
    }
}
