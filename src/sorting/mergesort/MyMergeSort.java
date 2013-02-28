package sorting.mergesort;

import utils.PrintUtils;

public class MyMergeSort extends PrintUtils{
	
	  private static int[] numbers;
	  private static int[] helper;
	  
	  private static int number;

	  public static void sort(int[] values) {
		    numbers = values;
		    number = values.length;
		    helper = new int[number];
		    mergesort(0, number - 1);
		  }
	
	  private static void mergesort(int low, int high) {
		    // Check if low is smaller then high, if not then the array is sorted
		  
		  println("********************* in outer if *******************************");
	      println("low : "+low);
	      println("high : "+high);
	      println();
	      sleep(1);
		    if (low < high) {
		      // Get the index of the element which is in the middle
		      
		      int middle = low + (high - low) / 2;
		      sleep(1);
		      println("low : "+low);
		      println("high : "+high);
		      println("middle : "+middle);
		      sleep(1);
		      println();
		      // Sort the left side of the array
		      mergesort(low, middle);
		      // Sort the right side of the array
		      mergesort(middle + 1, high);
		      
		      // Combine them both
		      merge(low, middle, high);
		    }
	  }
	  
	  private static void merge(int low, int middle, int high) {

		    // Copy both parts into the helper array
		    for (int i = low; i <= high; i++) {
		      helper[i] = numbers[i];
		    }

		    int i = low;
		    int j = middle + 1;
		    int k = low;
		    // Copy the smallest values from either the left or the right side back
		    // to the original array
		    while (i <= middle && j <= high) {
		      if (helper[i] <= helper[j]) {
		        numbers[k] = helper[i];
		        i++;
		      } else {
		        numbers[k] = helper[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    while (i <= middle) {
		      numbers[k] = helper[i];
		      k++;
		      i++;
		    }
		    sleep(1);
		    print("Current sorted numbers : ");
		    for(int counter = 0; counter < numbers.length; ++counter){
		    	sleep(1);
		    	print(numbers[counter]+", ");
		    }
		    println("");
		  }
}
