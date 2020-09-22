package ru.sendel.numericsquare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotContoller {

    @GetMapping
    protected String init() {
        return "it's ok!";
    }
}
