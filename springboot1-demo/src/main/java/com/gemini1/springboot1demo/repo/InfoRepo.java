package com.gemini1.springboot1demo.repo;

import com.gemini1.springboot1demo.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Repository
public interface InfoRepo extends JpaRepository<Info,Integer>{

}
