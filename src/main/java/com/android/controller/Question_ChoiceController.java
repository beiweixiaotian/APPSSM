package com.android.controller;

import com.android.entity.Question_Choice;
import com.android.service.Question_ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Question_ChoiceController {
    @Autowired
    Question_ChoiceService question_choiceService;
    @RequestMapping("/android/getAllQuestion_Choice")
    public Map<String, Object> getAllQuestion_Choice(){
        return question_choiceService.getAllQuestion_Choice();
    }
    @RequestMapping("/android/getQuestionChoiceById")
    public Map<String, Object> getQuestionChoiceById(int id){
        return question_choiceService.getQuestionChoiceById(id);
    }
    @RequestMapping("/android/addQuestionChoice")
    public Map<String, Object> addQuestionChoice(Question_Choice question_choice){
        return question_choiceService.addQuestionChoice(question_choice);
    }
    @RequestMapping("/android/deleteQuestionChoice")
    public Map<String, Object> deleteQuestionChoice(int id){
        return question_choiceService.deleteQuestionChoice(id);
    }
}
