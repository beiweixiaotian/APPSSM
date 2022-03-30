package com.android.controller;

import com.android.entity.News;
import com.android.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/android")
public class NewsController {
    @Autowired
    NewsService newsService;
    @RequestMapping("/getAllNews")
    public Map<String, Object> getAllNews(int msg_to){return newsService.getAllNews(msg_to);}

    @RequestMapping("/getNewsById")
    public Map<String, Object> getNewsById(int id){return newsService.getNewsById(id);}

    @RequestMapping("/addNews")
    public Map<String, Object> addNews(News news){
        return newsService.addNews(news);
    }

    @RequestMapping("/deleteNews")
    public Map<String, Object> deleteNews(int id){
        return newsService.deleteNews(id);
    }
}
