package recursion;

import utils.PrintUtils;

/**
 * This class illustrates a  recursive method call being called twice
 * with the same method.
 * 
 *
 */
public class Driver extends PrintUtils {

	static int counter = 0;

	public static void main(String args[]) {
		recMethod();
	}

	private static void recMethod() {

		++counter;
		if (counter < 5) {
			println("calling recMethod 1");
			println("counter is "+counter);
			println("1'st call");
			recMethod();
			sleep(5);
			println();
			
			println("calling recMethod 2");
			println("counter is "+counter);
			println("2nd call");
			recMethod();
			
			println("here");
			recMethod();
			
			println("end this rec");
			
			
		}
	}

}
