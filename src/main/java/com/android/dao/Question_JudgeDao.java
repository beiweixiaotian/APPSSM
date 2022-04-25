package com.android.dao;

import com.android.entity.Question_Choice;
import com.android.entity.Question_Judge;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

public interface Question_JudgeDao {

    @Select("select * from q_judge;")
    List<Question_Judge> getAllQuestion_Judge();

    @Select("select * from q_judge where q_id=#{q_id}")
    Question_Judge getQuestionJudgeById(int id);

    @Select("select * from q_judge ORDER BY RAND() limit 5")
    List<Question_Judge> getQuestion_JudgeRad();

    @Insert("insert q_Judge (q_content, q_answer) values (#{q_content}, #{q_answer})")
    int addQuestionJudge(Question_Judge question_judge);

    @Delete("delete from q_judge where q_id = #{q_id}")
    int deleteQuestionJudge(int id);
}
