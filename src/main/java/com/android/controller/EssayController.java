package com.android.controller;

import com.android.entity.Essay;
import com.android.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/android")
public class EssayController {
    @Autowired
    EssayService essayService;
    @RequestMapping("/getAllEssay")
    public Map<String, Object> getAllEssay(){
        return essayService.getAllEssay();
    }
    @RequestMapping("/getAllEssay")
    public Map<String, Object> getEssayById(int id){
        return essayService.getEssayById(id);
    }
    @RequestMapping("/getAllEssay")
    public Map<String, Object> addEssay(Essay essay){
        return essayService.addEssay(essay);
    }
    @RequestMapping("/getAllEssay")
    public Map<String, Object> deleteEssay(int id){
        return essayService.deleteEssay(id);
    }
}
