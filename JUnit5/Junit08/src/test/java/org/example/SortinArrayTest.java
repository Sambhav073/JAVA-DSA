package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class SortinArrayTest {

    @Test
    void testsortArray_Performance() {
        SortingArray  sa=new SortingArray();
        int unsorted[]={1,5,4};
        assertTimeout(Duration.ofMillis(20),()->sa.sortArray(unsorted));
    }
}