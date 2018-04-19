package com.deer.www.deer.service.feign.controller;

import com.deer.www.deer.service.feign.service.ISchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedualController {

    @Autowired
    private ISchedualService schedualService;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualService.sayHiFromClientOne(name);
    }
}
