package com.thoughtworks.carauction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @RequestMapping(value = "/")
    public String testView(){
        return "testjsp";
    }
}
