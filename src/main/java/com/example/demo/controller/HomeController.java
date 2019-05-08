package com.example.demo.controller;

import com.example.demo.service.HiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

// 沒有视图使用RestController  有视图使用Controller
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @Resource(name = "hiService")
    private HiService hiService;

    @RequestMapping(value = "/index")
    public String HiSp() {
        return hiService.hi();
    }
}
