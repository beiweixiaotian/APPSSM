package com.android.service;

import com.android.dao.CommentDao;
import com.android.entity.Comment;
import com.android.entity.Essay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class CommentImpService implements CommentService{
    @Autowired
    CommentDao commentDao;
    @Override
    public Map<String, Object> getAllComment(int essay_id) {
        Map<String, Object> map = new TreeMap<>();
        List<Comment> comments;
        try{
            comments = commentDao.getAllComment(essay_id);
            if (comments != null){
                map.put("state", 1);
                map.put("comments", comments);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> getCommentById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Comment comment;
        try{
            comment = commentDao.getCommentById(id);
            if (comment != null){
                map.put("state", 1);
                map.put("comment", comment);
            }
            else {
                map.put("state", 0);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map<String, Object> addComment(Comment comment) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", commentDao.addComment(comment));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteComment(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", commentDao.deleteComment(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }
}
