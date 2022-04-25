package com.android.dao;

import com.android.entity.Question_Choice;
import com.android.entity.Question_Choice_Mut;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

public interface Question_Choice_MutDao {

    @Select("select * from q_choice_mut")
    List<Question_Choice_Mut> getAllQuestion_Choice_Mut();

    @Select("select * from q_choice_mut where q_id = #{q_id}")
    Question_Choice_Mut getQuestionChoiceMutById(int id);

    @Select("select * from q_choice_mut ORDER BY RAND() limit 5")
    List<Question_Choice_Mut> getQuestion_ChoiceMutRad();

    @Insert("insert q_choice_mut (q_a, q_b, q_c, q_d, q_content, q_answer) values (#{q_a}, #{q_b}, #{q_c}, #{q_d}, #{q_content}, #{q_answer})")
    int addQuestionChoiceMut(Question_Choice_Mut question_choice_mut);

    @Delete("delete from q_choice_mut where q_id=#{q_id}")
    int deleteQuestionChoiceMut(int id);
}
