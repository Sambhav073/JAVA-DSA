package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // only 1 instance will be created of test class no matter how many test methods are their
class ShapeTest {
    Shape shape;
    ShapeTest(){
        System.out.println("Objected created");
    }

    @BeforeEach
    void init(){
         shape=new Shape();
        System.out.println("Before Test");
    }

    @Test
    void squareArea() {
        assertEquals(4,shape.squareArea(2));
        System.out.println("Running Square tes");
    }

    @Test
    void circleArea() {
        assertEquals(78.5,shape.circleArea(5));
        System.out.println("Running circle test");
    }

    @AfterEach
    void complete(){
        System.out.println("After test");
    }
}