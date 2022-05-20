package com.gemini1.springboot1demo.service;

import com.gemini1.springboot1demo.model.Info;
import com.gemini1.springboot1demo.repo.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ServiceInfo {
    public abstract void insertData(List<Info> info);
    public abstract Info fetchData(Integer eId);
    public abstract String updataData(Info info, Integer eId);

    public abstract String deleteData(Integer eId);
}
