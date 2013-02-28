package sorting.mergesort;

import utils.PrintUtils;

public class Driver extends PrintUtils{
	
	public static void main(String args[]){
		
		int[] array = {1 , 0 , 2 , 7 , 3};
		
		MyMergeSort.sort(array);
		
		println("Finished!!");
		exit();
 	}

}
