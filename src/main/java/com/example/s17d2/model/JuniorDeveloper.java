package com.example.s17d2.model;

import com.example.s17d2.enums.Experience;

public class JuniorDeveloper extends Developer {
    public JuniorDeveloper(Integer id, String name, Double salary) {
        super(id, name, salary, Experience.JUNIOR);
    }
}
