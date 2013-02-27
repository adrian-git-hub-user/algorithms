package sorting.mergesort;

public class Driver extends Utils{
	
	public static void main(String args[]){
		
		int[] array = {1 , 0 , 2 , 7 , 3};
		
		MyMergeSort.sort(array);
		
		println("Finished!!");
		exit();
 	}

}
