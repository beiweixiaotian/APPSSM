package com.android.service;

import com.android.entity.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



public interface NewsService {
    public Map<String, Object> getAllNews(String msg_to);
    public Map<String, Object> getNewsById(String id);
    public Map<String, Object> addNews(News news);
    public Map<String, Object> deleteNews(String id);
}
