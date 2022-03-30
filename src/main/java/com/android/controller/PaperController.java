package com.android.controller;

import com.android.entity.Paper;
import com.android.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/android")
public class PaperController {
    @Autowired
    PaperService paperService;
    @RequestMapping("getAllPaper")
    public Map<String, Object> getAllPaper(){
        return paperService.getAllPaper();
    }
    @RequestMapping("getPaperById")
    public Map<String, Object> getPaperById(int id){
        return paperService.getPaperById(id);
    }
    @RequestMapping("addPaper")
    public Map<String, Object> addPaper(Paper paper){
        return paperService.addPaper(paper);
    }
    @RequestMapping("deletePaper")
    public Map<String, Object> deletePaper(int id){
        return paperService.deletePaper(id);
    }
}
