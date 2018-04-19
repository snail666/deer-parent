package com.deer.www.deer.service.feign.service.impl;

import com.deer.www.deer.service.feign.service.ISchedualService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ISchedualService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
