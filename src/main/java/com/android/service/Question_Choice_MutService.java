package com.android.service;

import com.android.entity.Question_Choice_Mut;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface Question_Choice_MutService {

    public Map<String, Object> getAllQuestion_Choice_Mut();

    public Map<String, Object> getQuestionChoiceMutById(int id);

    public Map<String, Object> addQuestionChoiceMut(Question_Choice_Mut question_choice_mut);

    public Map<String, Object> deleteQuestionChoiceMut(int id);
}
