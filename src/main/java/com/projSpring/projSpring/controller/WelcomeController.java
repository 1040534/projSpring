package com.projSpring.projSpring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WelcomeController {

    private List<String> tasks = Arrays.asList(
            "Rest", "Spring", "Macacos", "Teste");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("tasks", tasks);
        return "welcome";
    }


}