package com.company;

public class MergeSort implements ISorting {

	@Override
	public int[] sorting(int[] unsortedArray) {
		// TODO Auto-generated method stub
		mergeSort(unsortedArray,0,unsortedArray.length-1);
		return unsortedArray;
	}

	//splitMethod
	private void mergeSort(int[] unsortedArray, int left, int right) {
		// TODO Auto-generated method stub
		if ( left< right){
			int mid = (left+right)/2;
			mergeSort(unsortedArray, left, mid);
			mergeSort(unsortedArray,mid+1,right);
			merge(unsortedArray,left,mid,right);
		}
	}

	private void merge(int[] array,int left, int mid, int right){
		int n1=mid- left +1;
		int n2= right - mid;
		int[] leftTempArray = new int[n1];
		int[] rightTempArray = new int[n2];

		for(int i=0;i<n1;i++){
			leftTempArray[i] = array[left+i];
		}
		for(int j=0;j<n2;j++){
			rightTempArray[j] = array[mid+1+j];
		}

		int i=0, j=0;
		int k = left;
		while(i<n1 && j <n2){
			if(leftTempArray[i] < rightTempArray[j]){
				array[k] = leftTempArray[i];
				i++;
			}else {
				array[k] = rightTempArray[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			array[k] = leftTempArray[i];
			i++;k++;
		}
		while(j<n2){
			array[k] = rightTempArray[j];
			j++;k++;
		}

	}


	private void mergeApproach1(int[] array,int start,int mid,int end){
		int[] tempAray = new int[end-start + 1];

		int leftSlot = start;
		int rightSlot = mid+1;
		int k=0;
		while(leftSlot <= mid && rightSlot <= end){
			if(array[leftSlot] < array[rightSlot]){
				tempAray[k]= array[leftSlot];
				leftSlot++;
			}else
			{
				tempAray[k]= array[rightSlot];
				rightSlot++;
			}
			k++;
		}
	if(leftSlot<= mid){
		while(leftSlot <= mid){
			tempAray[k]=array[leftSlot];
			leftSlot++;
			k++;
		}
	}
		if(rightSlot<= mid){
			while(leftSlot <= mid){
				tempAray[k]=array[rightSlot];
				rightSlot++;
				k++;
			}
		}
		for (int i = 0; i < tempAray.length ; i++) {
			array[i] = tempAray[i];
		}

	}

}
