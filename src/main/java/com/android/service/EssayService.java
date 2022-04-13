package com.android.service;

import com.android.entity.Essay;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EssayService {
    public Map<String, Object> getAllEssay();

    public Map<String, Object> getEssayById(int id);

    public Map<String, Object> addEssay(Essay essay);

    public Map<String, Object> deleteEssay(int id);
}
