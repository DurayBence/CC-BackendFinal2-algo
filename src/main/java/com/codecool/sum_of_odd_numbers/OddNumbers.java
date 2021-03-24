package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int result = 0;

        for (Integer i : numbers) {
            if (i % 2 == 1 || i % 2 == -1) {
                result += i;
            }
        }

        return result;
    }
}