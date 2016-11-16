package com.bluecry.Basic;
//import com.bluecry.*;

public class Sorting {
	private static int array[];
    private static int length;
    
    public Sorting(String[] args){
    	//Do bubble sort
		 int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	        bubble_srt(input);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Do bubble sort
		 int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	        bubble_srt(input);
	        
	     //Break
	        System.out.print("----------------------------------------------------------\n");
	        System.out.print("\n");
	     //Now do selection sort
	        int[] arr1 = {10,34,2,56,7,67,88,42};
	        int[] arr2 = doSelectionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	        //Break
	        System.out.print("\n");
	        System.out.print("----------------------------------------------------------\n");
	        System.out.print("\n");
	        
	        //Do insertion sort
	        int[] irr1 = {10,34,2,56,7,67,88,42};
	        int[] irr2 = doInsertionSort(irr1);
	        for(int i:irr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	        
	      //Break
	        System.out.print("\n");
	        System.out.print("----------------------------------------------------------\n");
	        System.out.print("\n");
	        
	        //Do a quick sort
	        int[] inputnum = {24,2,45,20,56,75,2,56,99,53,12};
	        sort(inputnum);
	        for(int i:inputnum){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	      
	        
	}

	//Quick sort
    public static void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private static void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

	//Insertion sort
	public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
	
	// Selection sort
	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
	 // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
    //Part of bubble sort
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    //part of bubble sort
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
