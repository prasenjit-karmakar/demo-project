package com.techolution.sampleapp.controller;

import com.techolution.sampleapp.service.NumberArrangementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 27-07-2017.
 */

@RestController
@RequestMapping("/api/v0/sampleapp/arrange")
public class NumberArrangementController {
    private final NumberArrangementService numberArrangementService;

    public NumberArrangementController(NumberArrangementService numberArrangementService) {
        this.numberArrangementService = numberArrangementService;
    }

    @GetMapping("/{stringArray}")
    public String arrangeNumbers(@PathVariable String stringArray) {
        return numberArrangementService.arrangeNumbers(stringArray);
    }
}