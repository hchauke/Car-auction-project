package com.thoughtworks.carauction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @RequestMapping(value = "/")
    public ModelAndView testView(){
        String message = "hello, Model and View";
        return new ModelAndView("testjsp", "message", message);
    }

    @RequestMapping(value = "/all-cars", method = RequestMethod.GET)
    public String displayAllCars(){
        return "home-page";
    }


}
