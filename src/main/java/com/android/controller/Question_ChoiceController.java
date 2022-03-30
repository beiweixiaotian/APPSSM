package com.android.controller;

import com.android.entity.Question_Choice;
import com.android.service.Question_ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/android")
public class Question_ChoiceController {
    @Qualifier("question_ChoiceService")
    @Autowired
    Question_ChoiceService question_choiceService;
    @RequestMapping("/getAllQuestion_Choice")
    public Map<String, Object> getAllQuestion_Choice(){
        return question_choiceService.getAllQuestion_Choice();
    }
    @RequestMapping("/getQuestionChoiceById")
    public Map<String, Object> getQuestionChoiceById(int id){
        return question_choiceService.getQuestionChoiceById(id);
    }
    @RequestMapping("/addQuestionChoice")
    public Map<String, Object> addQuestionChoice(Question_Choice question_choice){
        return question_choiceService.addQuestionChoice(question_choice);
    }
    @RequestMapping("/deleteQuestionChoice")
    public Map<String, Object> deleteQuestionChoice(int id){
        return question_choiceService.deleteQuestionChoice(id);
    }
}
