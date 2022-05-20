package com.gemini1.springboot1demo.service;

import com.gemini1.springboot1demo.controller.InfoController;
import com.gemini1.springboot1demo.model.Info;
import com.gemini1.springboot1demo.repo.InfoRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoService implements ServiceInfo{

    private static final Logger logger= LoggerFactory.getLogger(InfoController.class);

    @Autowired
    InfoRepo infoRepo;
    public void insertData(List<Info> info){
        infoRepo.saveAll(info);
    }

    @Override
    public Info fetchData(Integer eId) {
        try {
            Optional<Info> record=infoRepo.findById(eId);
            return record.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            logger.info("Enter valid id");
        }
        return null;
    }

    @Override
    public String updataData(Info info, Integer eId) {
        try {
            Info infoRepoById = infoRepo.findById(eId).orElse(null);
            infoRepoById.setEmail(info.getEmail());
            infoRepoById.setName(info.getName());
            infoRepo.save(infoRepoById);
            return "Value updated";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            logger.info("Enter valid id");
        }
        return null;
    }

    @Override
    public String deleteData(Integer eId) {
        Optional<Info> repo=infoRepo.findById(eId);
        try {
            infoRepo.deleteById(eId);
            return "Data Deleted";
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            logger.info("Enter valid id");
        }
        return "Enter Valid Id";
    }
}
