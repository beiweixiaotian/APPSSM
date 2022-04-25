package com.android.service;

import com.android.entity.Question_Judge;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface Question_JudgeService {

    public Map<String, Object> getAllQuestion_Judge();

    public Map<String, Object> getQuestionJudgeById(int id);

    public Map<String, Object> addQuestionJudge(Question_Judge question_judge);

    public Map<String, Object> deleteQuestionJudge(int id);
}
