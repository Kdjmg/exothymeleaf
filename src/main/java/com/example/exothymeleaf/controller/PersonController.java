package com.example.exothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.exothymeleaf.model.Person;

@Controller
public class PersonController {

    @GetMapping
    public String homePage(){
        return "homePage";
    }

    @GetMapping("/secondPage")
    public String secondPage(){
        return "secondPage";
    }

    @GetMapping("/thirdPage")
    public String thirdPage(){
        return "thirdPage";
    }

    // @PostMapping("submitForm")
    //     public String submitFors(@ModelAttribute("personSubmit")Person person){
    //         System.out.println(person);
    //         System.out.println(person.getName());
    //         return "thirdPage";
    // }
}
