package com.gemini1.springboot1demo.controller;

import com.gemini1.springboot1demo.model.Info;
import com.gemini1.springboot1demo.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class InfoController {

    private static final Logger logger= LoggerFactory.getLogger(InfoController.class);

    @Autowired
    InfoService serviceInfo;

    @PostMapping("/info1")
    private String insert(@RequestBody List<Info> info){
        this.serviceInfo.insertData(info);
        return "Data has been inserted";
    }

    @GetMapping("/info2/{eId}")
    public Info fetch(@PathVariable Integer eId){
       return this.serviceInfo.fetchData(eId);
    }

    @PutMapping("/info/{eId}")
    public String update(@RequestBody Info info,@PathVariable Integer eId) {
        return this.serviceInfo.updataData(info, eId);
    }

    @DeleteMapping("info3/{eId}")
    public String delete(@PathVariable Integer eId){
       return this.serviceInfo.deleteData(eId);
    }
}
