package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // maps to home.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // maps to about.html
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects"; // maps to projects.html
    }
     @GetMapping("/education")
     public String educationPage() {
            return "education";
        }
     @GetMapping("/skills")
     public String skills() {
         return "skills"; // skills.html inside templates/
     }

    }

