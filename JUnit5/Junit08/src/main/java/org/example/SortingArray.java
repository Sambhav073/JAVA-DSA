package org.example;

import java.util.Arrays;

public class SortingArray {
    public int[] sortArray(int arr[]){

        for(int i=1;i<=100000;i++){
            Arrays.sort(arr);
        }
        return arr;
    }
}
