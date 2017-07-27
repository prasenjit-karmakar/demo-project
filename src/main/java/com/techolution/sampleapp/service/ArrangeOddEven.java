package com.techolution.sampleapp.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasenjit karmakar
 */
@Component
public class ArrangeOddEven {

    public int[] arrangeOddEven(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evens.add(arr[i]);
            } else if (arr[i] % 2 != 0) {
                odds.add(arr[i]);
            }
        }
        odds.addAll(evens);
        return odds.stream().mapToInt(i -> i).toArray();
    }
}
