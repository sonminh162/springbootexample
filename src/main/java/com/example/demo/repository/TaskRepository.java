package com.example.demo.repository;

import com.example.demo.model.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    @Autowired
    private SimpleBean simpleBean;

    public String testBean() {
        return simpleBean.toString();
    }
}
