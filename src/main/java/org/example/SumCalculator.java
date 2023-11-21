package org.example;

import java.util.stream.IntStream;

public class SumCalculator {
    public int sum(int n){
        return IntStream.range(1, n+1).reduce((k, m) -> k+m).orElseThrow(IllegalArgumentException::new);
    }
}
