package com.example.springjwtauthentication.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ui")
public class UiManagementController {
    @GetMapping
    public String getMainPage() {
        return "/index";
    }

}

