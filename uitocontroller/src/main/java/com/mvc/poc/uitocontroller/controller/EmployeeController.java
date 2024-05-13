package com.mvc.poc.uitocontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.poc.uitocontroller.model.Employee;

@Controller
public class EmployeeController {

    @GetMapping("/register")
    public String showReg() {
        return "EmployeeReg";
    }

    @PostMapping("/add")
    public String readData(@ModelAttribute Employee employee, Model model) {

        System.out.println(employee);
        model.addAttribute("emp", employee);

        return "EmpData";
    }

}
