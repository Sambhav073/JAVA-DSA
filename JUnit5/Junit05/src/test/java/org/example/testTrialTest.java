package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testTrialTest {

    testTrial tt=new testTrial();

    @Test
    void test(){
        assertEquals(576,tt.squareArea(24),"failed the test"); // here the string object is created no matter test pass or fail
    }

    @Test
    void test_supplierInterface(){
        assertEquals(56,tt.squareArea(24),()->"failed the test");//here the string object is created only if the test fails
    }

    @Test
    void testOpposite(){
        assertNotEquals(56,tt.squareArea(24),()->"failed the test");
    }

}