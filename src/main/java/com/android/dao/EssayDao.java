package com.android.dao;
import com.android.entity.Essay;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface EssayDao {
    @Select("select * from essay")
    List<Essay> getAllEssay();

    @Select("select * from essay where essay_id = #{essay_id}")
    Essay getEssayById(int id);

    @Insert("insert essay (essay_title, essay_content, user_id, essay_create_date, user_name) values (#{essay_title}, #{essay_content}, #{user_id}, #{essay_create_date}, #{user_name})")
    int addEssay(Essay essay);

    @Delete("delete from essay where essay_id = #{essay_id}")
    int deleteEssay(int id);
}
