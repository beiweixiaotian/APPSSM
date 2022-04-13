package com.android.controller;

import com.android.entity.Comment;
import com.android.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;
    @RequestMapping("/android/getAllComment")
    public Map<String, Object> getAllComment(int essay_id){
        return commentService.getAllComment(essay_id);
    }
    @RequestMapping("/android/getCommentById")
    public Map<String, Object> getCommentById(int id){
        return commentService.getCommentById(id);
    }
    @RequestMapping("/android/addComment")
    public Map<String, Object> addComment(Comment comment){
        return commentService.addComment(comment);
    }
    @RequestMapping("/android/deleteComment")
    public Map<String, Object> deleteComment(int id){
        return commentService.deleteComment(id);
    }
}
