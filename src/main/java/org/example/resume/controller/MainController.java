package org.example.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    public static final String HELLO = "hello";

    @GetMapping("/")
    public String helloPage(Model model) {

        return HELLO;
    }
}
