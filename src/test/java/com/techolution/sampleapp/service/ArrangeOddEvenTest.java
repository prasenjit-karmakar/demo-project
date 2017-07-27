package com.techolution.sampleapp.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Lenovo on 27-07-2017.
 */
public class ArrangeOddEvenTest {
    private ArrangeOddEven arrangeOddEven;

    @Before
    public void setUp() {
        arrangeOddEven = new ArrangeOddEven();
    }

    @Test
    public void whenTheInputArrayIsEmpty() {
        int[]  result = arrangeOddEven.arrangeOddEven(new int[]{});
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void whenTheInputArrayIsAlreadyArrangedAsRequired() {
        int[] input = new int[]{1, 3, 5, 7, 6};
        int[] result = arrangeOddEven.arrangeOddEven(input);
        Assert.assertNotNull(result);
        Assert.assertEquals(input.length, result.length);
        Assert.assertArrayEquals(input, result);
    }

    @Test
    public void whenTheInputArrayIsNotArrangedAsRequired() {
        int[] input = new int[]{1, 3, 5, 7, 6,9};
        int[] resultExpected = new int[]{1, 3, 5, 7, 9,6};
        int[] result = arrangeOddEven.arrangeOddEven(input);
        Assert.assertNotNull(result);
        Assert.assertEquals(input.length, result.length);
        Assert.assertArrayEquals(resultExpected, result);
    }
}
