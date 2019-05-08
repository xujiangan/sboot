package com.example.demo.impl;

import com.example.demo.service.HiService;
import org.springframework.stereotype.Service;

@Service("hiService")
public class HiServiceImpl implements HiService {
    @Override
    public String hi() {
        return "hi springboot";
    }
}
