package com.android.service;

import com.android.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CommentService {

    public Map<String, Object> getAllComment(int essay_id);

    public Map<String, Object> getCommentById(int id);

    public Map<String, Object> addComment(Comment comment);

    public Map<String, Object> deleteComment(int id);
}
