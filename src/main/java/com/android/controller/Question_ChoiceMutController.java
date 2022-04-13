package com.android.controller;


import com.android.entity.Question_Choice_Mut;
import com.android.service.Question_ChoiceService;
import com.android.service.Question_Choice_MutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Question_ChoiceMutController {
    @Autowired
    Question_Choice_MutService question_choice_mutService;
    @RequestMapping("/android/getAllQuestion_Choice_Mut")
    public Map<String, Object> getAllQuestion_Choice_Mut(){
        return question_choice_mutService.getAllQuestion_Choice_Mut();
    }
    @RequestMapping("/android/getQuestionChoiceMutById")
    public Map<String, Object> getQuestionChoiceMutById(int id){
        return question_choice_mutService.getQuestionChoiceMutById(id);
    }
    @RequestMapping("/android/addQuestionChoiceMut")
    public Map<String, Object> addQuestionChoiceMut(Question_Choice_Mut question_choice_mut){
        return question_choice_mutService.addQuestionChoiceMut(question_choice_mut);
    }
    @RequestMapping("/android/deleteQuestionChoiceMut")
    public Map<String, Object> deleteQuestionChoiceMut(int id){
        return question_choice_mutService.deleteQuestionChoiceMut(id);
    }
}
