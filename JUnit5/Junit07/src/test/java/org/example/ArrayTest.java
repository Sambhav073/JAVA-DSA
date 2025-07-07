package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void returnArray() {
        int expected[]={2,4,6,8};
        Array ar=new Array();
        assertArrayEquals(expected,ar.returnArray());
    }

    @Test
    void testSortingArray_Exception(){

//        try{
//            SortinArray sa=new SortinArray();
//            int unsorted[]= null;
//            int sortedArray[]=sa.sortingArray(unsorted);
//            System.out.println("Statement below exception");
//            fail();
//        } catch (NullPointerException e) {
//            System.out.println("Exception generated");
//        }
        SortinArray sa=new SortinArray();
        int unsorted[]=null;
        assertThrows(NullPointerException.class,()->sa.sortingArray(unsorted));
    }
}