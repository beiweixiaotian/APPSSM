package com.android.service;

import com.android.dao.Question_ChoiceDao;
import com.android.dao.Question_JudgeDao;
import com.android.entity.Question_Choice;
import com.android.entity.Question_Judge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


@Component
@Service("Question_JudgeImpService")
public class Question_JudgeImpService implements Question_JudgeService{
    @Autowired
    private Question_JudgeDao question_judgeDao;
    @Override
    public Map<String, Object> getAllQuestion_Judge() {
        Map<String, Object> map = new TreeMap<>();
        List<Question_Judge> question_judges;
        try{
            question_judges = question_judgeDao.getAllQuestion_Judge();
            if (question_judges != null){
                map.put("state", 1);
                map.put("question_judges", question_judges);
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
    public Map<String, Object> getQuestionJudgeById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Question_Judge question_judge;
        try{
            question_judge = question_judgeDao.getQuestionJudgeById(id);
            if (question_judge != null){
                map.put("state", 1);
                map.put("question_judge", question_judge);
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
    public Map<String, Object> addQuestionJudge(Question_Judge question_judge) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_judgeDao.addQuestionJudge(question_judge));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteQuestionJudge(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", question_judgeDao.deleteQuestionJudge(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }
}
