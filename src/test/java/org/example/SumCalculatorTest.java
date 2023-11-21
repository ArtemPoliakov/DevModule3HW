package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalculator();
    }
    @Test
    void sumOneShouldReturnOne(){
        Assertions.assertEquals(1, calculator.sum(1));
    }
    @Test
    void sumThreeShouldReturnSix(){
        Assertions.assertEquals(6, calculator.sum(3));
    }
    @Test
    void sumZeroShouldThrow(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}