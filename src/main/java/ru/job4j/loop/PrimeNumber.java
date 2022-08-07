package ru.job4j.loop;

import java.util.Arrays;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int number = count; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
