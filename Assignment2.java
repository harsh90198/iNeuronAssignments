package assignment2;

import java.util.Arrays;

public class Assignment2 {
	
	public static void bubbleSort(int a[]) {
		for(int i = 0; i < a.length - 1 ; i++) {
			for(int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	public static void duplicatesPresentInArray(int a[]) {
		
		
		for(int i = 0; i < a.length ; i++) {
			boolean duplicate = false;
			for(int j = i + 1; j < a.length ; j++) {
				if(a[j] == a[i]) {
					duplicate = true;
					break;
				}
			}
			if(duplicate) {
				System.out.print("duplicate element in array is " + a[i]);
				System.out.println();
			}
		}
		
	}
	
	
	
	public static void selectionSort(int a[]) {
		
		
		for(int i = 0; i < a.length - 1 ; i++) {
			int min  = a[i];
			int minIndex = i;
			for(int j = i + 1; j < a.length ; j++) {
				if(a[j] < min) {
					min  = a[j];
					minIndex = j;
				}
				
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		
	}
	
	
	
	public static void mergeSort(int a[] , int si , int ei) {
		if(si >= ei) {
			return;
		}
		int mi =  si + ((ei - si) / 2);
		mergeSort(a , si , mi);
		mergeSort(a , mi + 1 , ei);
		merge(a , si , mi , ei);
	}
	
	
	

	private static void merge(int[] a, int si, int mi, int ei) {
		int mergedArr[] = new int[ei - si + 1];
		
		int i = si;  // For tracking index of first array
		int j = mi + 1; // For tracking index of second Arrray
		int k = 0; // For traking index o mergedArr

		while(i <= mi && j <= ei) {
			if(a[i] <= a[j]) {

				mergedArr[k] = a[i];
				i++;
				k++;
			}else {
				mergedArr[k] = a[j];
				j++;
				k++;
			}

		}
		
		while(i <= mi) {
			mergedArr[k] = a[i];
			i++;
			k++;
		}
		
		while(j <= ei) {
			mergedArr[k] = a[j];
			j++;
			k++;
		}
		
		for(i = 0 , j = si; i < mergedArr.length ; i++ , j++) {
			a[j] = mergedArr[i];
		}
		
	}
	
	public static void quickSort(int a[] , int si , int ei) {
		if(si  < ei) {
			int pivotIndex = partition(a , si , ei);
			quickSort(a , si , pivotIndex - 1);
			quickSort( a , pivotIndex + 1 , ei);
		}
			
	}

	private static int partition(int[] a, int si, int ei) {
		
		int pivotEle = a[ei];
		
		// this i for keep tracking of how much space would be created for elements 
		// which are smaller than pivot element
		 
		int i = si - 1;
		
		for(int j = si; j < ei ; j++) {
			if(a[j] < pivotEle) {
				i++;
				//swap
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		i++;
		int temp = a[i];
		a[i] = pivotEle;
		a[ei] = temp;
		return i;
		
		// i is our pivot index
	}
	
	public static boolean isSubsetOfArray(int a[] ,  int b[]) {
		// a is the array given
		// b is the array to be checked if its subset of a or not
		
		
		
		int tempArr[] = a;
		
		for(int i = 0; i < b.length ; i++) {
			boolean isSubset = false;
			for(int j = 0; j < tempArr.length ; j++) {
				if(b[i] == a[j]) {
					isSubset = true;
					break;
				}
			}
			if(!isSubset) {
				return isSubset;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6 , 5 , 4 , 3 , 2 , 1};
		//selectionSort(a);
		//System.out.println(Arrays.toString(a));
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
		int a1[] = {4,6,7,2,4,7,5,2,3,9};
		duplicatesPresentInArray(a1);

	}

}
