package com.android.service;

import com.android.entity.Paper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



public interface PaperService {
    public Map<String, Object> getAllPaper();

    public Map<String, Object> getPaperById(int id);

    public Map<String, Object> addPaper(Paper paper);

    public Map<String, Object> deletePaper(int id);
}
