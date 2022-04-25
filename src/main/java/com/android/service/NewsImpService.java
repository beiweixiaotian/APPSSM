package com.android.service;

import com.android.dao.NewsDao;
import com.android.entity.News;
import com.android.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


@Service
public class NewsImpService implements NewsService{

    @Autowired
    private NewsDao newsDao;
    @Override
    public Map<String, Object> getAllNews(String msg_to) {
        Map<String, Object> map = new TreeMap<>();
        List<News> news;
        try{
            news = newsDao.getAllNews(msg_to);
            if (news != null){
                map.put("state", 1);
                map.put("news", news);
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
    public Map<String, Object> getNewsById(String id) {
        Map<String, Object> map = new TreeMap<>();
        News news;
        try{
            news = newsDao.getNewsById(id);
            if (news != null){
                map.put("state", 1);
                map.put("news", news);
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
    public Map<String, Object> addNews(News news) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", newsDao.addNews(news));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteNews(String id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", newsDao.deleteNews(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }
}
