package com.android.service;

import com.android.dao.EssayDao;
import com.android.entity.Essay;
import com.android.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class EssayImpService implements EssayService{

    @Autowired
    private EssayDao essayDao;
    @Override
    public Map<String, Object> getAllEssay() {
        Map<String, Object> map = new TreeMap<>();
        List<Essay> essays;
        try{
            essays = essayDao.getAllEssay();
            if (essays != null){
                map.put("state", 1);
                map.put("essays", essays);
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
    public Map<String, Object> getEssayById(int id) {
        Map<String, Object> map = new TreeMap<>();
        Essay essay;
        try{
            essay = essayDao.getEssayById(id);
            if (essay != null){
                map.put("state", 1);
                map.put("essay", essay);
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
    public Map<String, Object> addEssay(Essay essay) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", essayDao.addEssay(essay));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }

    @Override
    public Map<String, Object> deleteEssay(int id) {
        Map<String, Object> map = new TreeMap<>();
        try {
            map.put("state", essayDao.deleteEssay(id));
        }
        catch (Exception e) {
            map.put("state",0);
        }
        return map;
    }
}
