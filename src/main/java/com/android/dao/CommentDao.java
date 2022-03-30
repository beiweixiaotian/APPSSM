package com.android.dao;

import com.android.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public interface CommentDao {

    @Select("select * from comment where essay_id = #{essay_id}")
    List<Comment> getAllComment(int essay_id);

    @Select("select * from comment where comment_id = #{comment_id}")
    Comment getCommentById(int id);

    @Insert("insert comment (user_id, essay_id, comment_content, com_create_date, user_name) values (#{user_id}, #{essay_id}, #{comment_content}, #{com_create_date}, #{user_name})")
    int addComment(Comment comment);

    @Delete("delete from comment where comment_id = #{comment_id}")
    int deleteComment(int id);

}
