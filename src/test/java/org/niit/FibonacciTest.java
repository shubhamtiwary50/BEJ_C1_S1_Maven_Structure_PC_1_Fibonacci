package org.niit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibonacciTest {

    Fibonacci fibonacci;
    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }

    @Test
    public void checkFibonacci(){
        int[] fbSeries = fibonacci.fibonacci(5);
        int[] expected = {0,1,1,2,3};
       assertArrayEquals(expected,fbSeries);
    }

}
