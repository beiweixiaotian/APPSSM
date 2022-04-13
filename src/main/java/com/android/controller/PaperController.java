package com.android.controller;

import com.android.entity.Paper;
import com.android.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PaperController {
    @Autowired
    PaperService paperService;
    @RequestMapping("/android/getAllPaper")
    public Map<String, Object> getAllPaper(){
        return paperService.getAllPaper();
    }
    @RequestMapping("/android/getPaperById")
    public Map<String, Object> getPaperById(int id){
        return paperService.getPaperById(id);
    }
    @RequestMapping("/android/addPaper")
    public Map<String, Object> addPaper(Paper paper){
        return paperService.addPaper(paper);
    }
    @RequestMapping("/android/deletePaper")
    public Map<String, Object> deletePaper(int id){
        return paperService.deletePaper(id);
    }
}
