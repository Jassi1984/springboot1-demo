package com.gemini1.springboot1demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "demo2")
public class Info {

    private String email;
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eId;

    @Override
    public String toString() {
        return "Info{" +
                "Name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", eId=" + eId +
                '}';
    }
}
