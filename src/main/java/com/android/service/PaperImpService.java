package com.android.service;

import com.android.dao.PaperDao;
import com.android.entity.Essay;
import com.android.entity.News;
import com.android.entity.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Component
@Service("PaperImpService")
public class PaperImpService implements PaperService{
    @Autowired
    private PaperDao paperDao;
    @Override
    public Map<String, Object> getAllPaper() {
        Map<String, Object> map = new TreeMap<>();
        List<Paper> papers;
        try{
            papers = paperDao.getAllPaper();
            if (papers != null){
                map.put("state", 1);
                map.put("papers", papers);
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
    public Map<String, Object> getPaperById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Paper paper;
        try{
            paper = paperDao.getPaperById(id);
            if (paper != null){
                map.put("state", 1);
                map.put("paper", paper);
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
    public Map<String, Object> addPaper(Paper paper) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", paperDao.addPaper(paper));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deletePaper(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", paperDao.deletePaper(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }
}
