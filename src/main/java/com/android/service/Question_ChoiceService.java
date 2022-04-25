package com.android.service;

import com.android.entity.Question_Choice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface Question_ChoiceService {

    public Map<String, Object> getAllQuestion_Choice();

    public Map<String, Object> getQuestionChoiceById(int id);

    public Map<String, Object> addQuestionChoice(Question_Choice question_choice);

    public Map<String, Object> deleteQuestionChoice(int id);
}
