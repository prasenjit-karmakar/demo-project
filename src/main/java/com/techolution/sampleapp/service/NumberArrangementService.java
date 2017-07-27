package com.techolution.sampleapp.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author Prasenjit Karmakar
 */
@Service
public class NumberArrangementService {
    private final ArrangeOddEven arrangeOddEven;

    public NumberArrangementService(ArrangeOddEven arrangeOddEven) {
        this.arrangeOddEven = arrangeOddEven;
    }

    public String arrangeNumbers(String numbers) {
        if (!StringUtils.isEmpty(numbers)) {
            int[] integers = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
            return Arrays.toString(arrangeOddEven.arrangeOddEven(integers));
        } else
            throw new RuntimeException("Input array cannot be empty");
    }
}
