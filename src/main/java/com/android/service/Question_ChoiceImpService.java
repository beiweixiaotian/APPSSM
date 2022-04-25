package com.android.service;

import com.android.dao.Question_ChoiceDao;
import com.android.entity.Paper;
import com.android.entity.Question_Choice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;



@Service
public class Question_ChoiceImpService implements Question_ChoiceService{
    @Autowired
    private Question_ChoiceDao question_choiceDao;
    @Override
    public Map<String, Object> getAllQuestion_Choice() {
        Map<String, Object> map = new TreeMap<>();
        List<Question_Choice> question_choices;
        try{
            question_choices = question_choiceDao.getAllQuestion_Choice();
            if (question_choices != null){
                map.put("state", 1);
                map.put("question_choices", question_choices);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> getQuestionChoiceById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Question_Choice question_choice;
        try{
            question_choice = question_choiceDao.getQuestionChoiceById(id);
            if (question_choice != null){
                map.put("state", 1);
                map.put("question_choice", question_choice);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> addQuestionChoice(Question_Choice question_choice) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_choiceDao.addQuestionChoice(question_choice));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteQuestionChoice(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_choiceDao.deleteQuestionChoice(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> getQuestion_ChoiceRad() {
        Map<String, Object> map = new TreeMap<>();
        List<Question_Choice> question_choices;
        try{
            question_choices = question_choiceDao.getQuestion_ChoiceRad();
            if (question_choices != null){
                map.put("state", 1);
                map.put("question_choices", question_choices);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
