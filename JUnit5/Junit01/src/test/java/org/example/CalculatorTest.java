package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void divide() {
        Calculator c=new Calculator();
        int actual=c.divide(10,2);
        int expectedResult=5;
        assertEquals(expectedResult,actual);
        System.out.println("first junit run");
    }
}