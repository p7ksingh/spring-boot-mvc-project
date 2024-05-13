package com.mvc.poc.mvcex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpData {

    @GetMapping("/show")
    public String getData() {
        return "DataPage";
    }

    @GetMapping("/showData")
    public String getModel(Model model) {
        model.addAttribute("emp1", 101);
        model.addAttribute("sal", 1000);
        model.addAttribute("add", "India");

        return "DataPage1";

    }

}
