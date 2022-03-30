package com.android.dao;
import com.android.entity.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface NewsDao{
    @Select("select * from news where msg_to = #{msg_to}")
    List<News> getAllNews(int msg_to);

    @Select("select * from news where msg_to = #{msg_to}")
    News getNewsById(int id);

    @Insert("insert news (msg_from, msg_to, msg_content) values (#{msg_from}, #{msg_to}, #{msg_content})")
    int addNews(News news);

    @Delete("delete from news where news_id = #{new_id}")
    int deleteNews(int id);
}
