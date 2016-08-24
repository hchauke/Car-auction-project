package com.thoughtworks.carauction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
    @RequestMapping(value = "/cars")
    public String testView(){

        return "testjsp";
    }
}
