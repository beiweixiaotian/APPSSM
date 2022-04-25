package com.android.service;

import com.android.dao.Question_ChoiceDao;
import com.android.dao.Question_Choice_MutDao;
import com.android.entity.Question_Choice;
import com.android.entity.Question_Choice_Mut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;



@Service
public class Question_Choice_MutImpService implements Question_Choice_MutService{
    @Autowired
    private Question_Choice_MutDao question_choice_mutDao;
    @Override
    public Map<String, Object> getAllQuestion_Choice_Mut() {
        Map<String, Object> map = new TreeMap<>();
        List<Question_Choice_Mut> question_choice_muts;
        try{
            question_choice_muts = question_choice_mutDao.getAllQuestion_Choice_Mut();
            if (question_choice_muts != null){
                map.put("state", 1);
                map.put("question_choice_muts", question_choice_muts);
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
    public Map<String, Object> getQuestionChoiceMutById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Question_Choice_Mut question_choice_mut;
        try{
            question_choice_mut = question_choice_mutDao.getQuestionChoiceMutById(id);
            if (question_choice_mut != null){
                map.put("state", 1);
                map.put("question_choice_mut", question_choice_mut);
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
    public Map<String, Object> addQuestionChoiceMut(Question_Choice_Mut question_choice_mut) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_choice_mutDao.addQuestionChoiceMut(question_choice_mut));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteQuestionChoiceMut(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_choice_mutDao.deleteQuestionChoiceMut(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> getQuestion_ChoiceMutRad() {
        Map<String, Object> map = new TreeMap<>();
        List<Question_Choice_Mut> question_choice_muts;
        try{
            question_choice_muts = question_choice_mutDao.getQuestion_ChoiceMutRad();
            if (question_choice_muts != null){
                map.put("state", 1);
                map.put("question_choice_muts", question_choice_muts);
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
