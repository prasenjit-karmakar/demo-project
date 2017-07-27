package com.techolution.sampleapp.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by Lenovo on 27-07-2017.
 */
@Service
public class NumberArrangementService {
    private final ArrangeOddEven arrangeOddEven;

    public NumberArrangementService(ArrangeOddEven arrangeOddEven) {
        this.arrangeOddEven = arrangeOddEven;
    }

    public String arrangeNumbers(String numbers) {
        int[] integers = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        return Arrays.toString(arrangeOddEven.arrangeOddEven(integers));
    }
}
