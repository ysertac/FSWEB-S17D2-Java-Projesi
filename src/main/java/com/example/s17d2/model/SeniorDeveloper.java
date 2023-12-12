package com.example.s17d2.model;

import com.example.s17d2.enums.Experience;

public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(Integer id, String name, Double salary) {
        super(id, name, salary, Experience.SENIOR);
    }
}
