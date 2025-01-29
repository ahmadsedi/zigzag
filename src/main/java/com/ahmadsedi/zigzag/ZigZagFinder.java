package com.ahmadsedi.zigzag;

import java.util.stream.IntStream;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 29/01/2025
 * Time: 22:33
 */

public class ZigZagFinder {
    public static int[] zigzags(int[] numbers) {
        return IntStream.iterate(0, i -> i < numbers.length, i -> i + 1).map(i -> zigzag(numbers, i)).toArray();
    }

    private static boolean isZigZag(int a, int b, int c) {
        return (a < b && b > c) || (a > b && b < c);
    }

    private static int zigzag(int[] numbers, int index){
        if(index==0||index== numbers.length-1){
            return -1;
        }
        return isZigZag(numbers[index-1], numbers[index ], numbers[index + 1]) ? 1 : 0;
    }
}
