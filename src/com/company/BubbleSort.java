package com.company;

public class BubbleSort implements ISorting {

	@Override
	public int[] sorting(int[] unsortedArray) {
		// TODO Auto-generated method stub
		
		for(int i = unsortedArray.length-1;i >0;i--) {
			for(int j=0;j<i;j++) {
				if(unsortedArray[j] > unsortedArray[j+1]) {
					Utilities.swap(unsortedArray, j, j+1);
				}
			}
		}
		return unsortedArray;
	}

}
