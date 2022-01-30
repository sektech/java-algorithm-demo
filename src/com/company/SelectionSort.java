package com.company;

public class SelectionSort implements ISorting {

	@Override
	public int[] sorting(int[] unsortedArray) {
		// TODO Auto-generated method stub
		
		for(int i= unsortedArray.length-1; i>0;i--) {
			int maxIndex = 0;
			for(int j=0;j <= i;j++) {
				if(    unsortedArray[j] >unsortedArray[maxIndex]  ){
					maxIndex = j;
				}
			}
			Utilities.swap(unsortedArray,maxIndex,i);
		}
		return unsortedArray;
	}

}
