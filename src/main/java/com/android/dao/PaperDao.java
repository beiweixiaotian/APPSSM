package com.android.dao;

import com.android.entity.Paper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import java.util.ArrayList;
import java.util.List;

public interface PaperDao {

    @Select("select * from paper")
    List<Paper> getAllPaper();

    @Select("select * from paper where paper_id = #{paper_id}")
    Paper getPaperById(int id);

    @Insert("insert paper (user_id, paper_score, paper_content) values (#{user_id}, #{paper_score}, #{paper_content})")
    int addPaper(Paper paper);

    @Delete("delete from paper where paper_id = #{paper_id}")
    int deletePaper(int id);
}
