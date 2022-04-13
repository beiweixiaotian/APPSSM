package com.android.service;

import com.android.entity.News;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public interface NewsService {
    public Map<String, Object> getAllNews(int msg_to);
    public Map<String, Object> getNewsById(int id);
    public Map<String, Object> addNews(News news);
    public Map<String, Object> deleteNews(int id);
}
