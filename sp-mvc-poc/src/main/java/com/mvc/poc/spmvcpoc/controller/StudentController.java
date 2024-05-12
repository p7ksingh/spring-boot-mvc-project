package com.mvc.poc.spmvcpoc.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showData() {
        return "Home";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String findData() {
        return "Home";
    }

    @RequestMapping(value = "/showerr", method = RequestMethod.GET)
    public String showError() {
        if (new Random().nextInt(10) < 11) {
            throw new RuntimeException("DUMMY ERROR");
        }
        return "Home";
    }

}
