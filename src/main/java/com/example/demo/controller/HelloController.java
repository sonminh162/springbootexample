package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private TaskService service;

    @RequestMapping("/")
    public String index() {
        return service.testService() + "TEST-OK";
    }

    @GetMapping("/list")
    public List<Task> getListTask() {
        List<Task> resultList = new ArrayList<>();
        resultList.add(new Task(1L,"quet_don_nha_cua","9h15", "quet, lau nen nha, vut rac"));
        resultList.add(new Task(2L,"rua_bat","9h15", "xem co bua dua gi khong mang di rua"));
        resultList.add(new Task(3L,"boi_thuoc_cho meo","9h15", "tim tuyp thuoc boi"));
        resultList.add(new Task(4L,"phoi quan ao","9h15", "mang do len tren tang phoi"));
        log.info(resultList.toString());
        return resultList;
    }
}
