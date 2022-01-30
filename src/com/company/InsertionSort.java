package com.company;

public class InsertionSort implements ISorting {

	@Override
	public int[] sorting(int[] unsortedArray) {
		// TODO Auto-generated method stub
		//23,-15,98,65,56,87
		 int n = unsortedArray.length;
	    for(int i=1;i<n;i++) {
	    	int key = unsortedArray[i];
	    	int j;
	    	for(j=i-1; j >=0 && unsortedArray[j]>key ;j--) {
	    		unsortedArray[j+1] = unsortedArray[j];
	    	}	    	
	    	unsortedArray[j+1]=key;
	    }
	        return unsortedArray;
	}

}













































/*



for (int i = 1; i < n; ++i) {
    int key = unsortedArray[i];
    int j = i - 1;

     Move elements of arr[0..i-1], that are
       greater than key, to one position ahead
       of their current position 
    while (j >= 0 && unsortedArray[j] > key) {
    	unsortedArray[j + 1] = unsortedArray[j];
        j = j - 1;
    }
    unsortedArray[j + 1] = key;
}*/