package com.lzy.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController(ListController.DOMAIN)
public class ListController {
    public static final String DOMAIN = "/list";
}
