package com.android.dao;
import com.android.entity.Question_Choice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.ArrayList;
import java.util.List;

public interface Question_ChoiceDao{

    @Select("select * from q_choice")
    List<Question_Choice> getAllQuestion_Choice();

    @Select("select * from q_choice where q_id=#{q_id}")
    Question_Choice getQuestionChoiceById(int id);

    @Select("select * from q_choice ORDER BY RAND() limit 5")
    List<Question_Choice> getQuestion_ChoiceRad();

    @Insert("insert q_choice (q_a, q_b, q_c, q_d, q_content, q_answer) values (#{q_a}, #{q_b}, #{q_c}, #{q_d}, #{q_content}, #{q_answer})")
    int addQuestionChoice(Question_Choice question_choice);

    @Delete("delete from q_choice where q_id = #{q_id}")
    int deleteQuestionChoice(int id);


}
