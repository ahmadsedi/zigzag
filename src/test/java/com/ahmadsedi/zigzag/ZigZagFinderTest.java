package com.ahmadsedi.zigzag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.ahmadsedi.zigzag.ZigZagFinder.zigzags;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 29/01/2025
 * Time: 12:51
 */

public class ZigZagFinderTest {
    @Test
    void givenNormalArray_returnAsExpected(){
        int[] numbers = new int[]{1, 2, 1, 3, 4};
        int[] result = zigzags(numbers);
        int[] expected = {-1, 1, 1, 0, -1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void givenEmptyArray_returnEmpty(){
        int[] numbers = new int[]{};
        int[] result = zigzags(numbers);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void givenSingleElementArray_returnOneNegative(){
        int[] numbers = new int[]{5};
        int[] result = zigzags(numbers);
        int[] expected = {-1};
        Assertions.assertArrayEquals(expected, result);
    }
}
