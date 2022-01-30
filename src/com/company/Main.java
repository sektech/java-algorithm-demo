package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO Auto-generated method stub
        //ISorting sortObj = new BubbleSort();
        //ISorting sortObj = new SelectionSort();
        //ISorting sortObj = new InsertionSort();
        ISorting sortObj = new MergeSort();
        int[] unSortedArrray = new int[] {101,23,-15,98,68,87,29};
        //101,23,-15
        //98,68,87,29
        //

        sortObj.sorting(unSortedArrray);
        System.out.print("Sorted Arrays: \n" + Arrays.toString(unSortedArrray) );
    }
}
