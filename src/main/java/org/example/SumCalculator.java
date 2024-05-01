package org.example;

public class SumCalculator {

    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}