package com.techolution.sampleapp.controller;

import com.techolution.sampleapp.service.NumberArrangementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @author Prasenjit Karmakar
 */

@RestController
@RequestMapping("/api/v0/sampleapp/arrange")
public class NumberArrangementController {
    private final NumberArrangementService numberArrangementService;

    public NumberArrangementController(NumberArrangementService numberArrangementService) {
        this.numberArrangementService = numberArrangementService;
    }

    @GetMapping
    public String arrangeNumbers(@RequestParam String input) {
        return numberArrangementService.arrangeNumbers(input);
    }
}