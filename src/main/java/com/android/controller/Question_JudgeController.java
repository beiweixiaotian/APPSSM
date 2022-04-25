package com.android.controller;

import com.android.entity.Question_Choice;
import com.android.entity.Question_Judge;
import com.android.service.Question_ChoiceService;
import com.android.service.Question_JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Question_JudgeController {

    @Autowired
    Question_JudgeService question_judgeService;
    @RequestMapping("/android/getAllQuestion_Judge")
    public Map<String, Object> getAllQuestion_Judge(){
        return question_judgeService.getAllQuestion_Judge();
    }
    @RequestMapping("/android/getQuestionJudgeById")
    public Map<String, Object> getQuestionJudgeById(int id){
        return question_judgeService.getQuestionJudgeById(id);
    }
    @RequestMapping("/android/addQuestionJudge")
    public Map<String, Object> addQuestionJudge(Question_Judge question_judge){
        return question_judgeService.addQuestionJudge(question_judge);
    }
    @RequestMapping("/android/deleteQuestionJudge")
    public Map<String, Object> deleteQuestionJudge(int id){
        return question_judgeService.deleteQuestionJudge(id);
    }
    @RequestMapping("/android/getQuestion_JudgeRad")
    public Map<String, Object> getQuestion_JudgeRad(){
        return question_judgeService.getQuestion_JudgeRad();
    }


}
