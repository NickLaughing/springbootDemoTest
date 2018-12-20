package com.lzy.demo.controller;

import com.lzy.demo.pojo.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(ListController.DOMAIN)
public class ListController {
    public static final String DOMAIN = "/list";

    @GetMapping()
    public List<Person> getPerson() {
        return null;
    }
}
