package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
        return average;
    }
}
