package sorting.performance.bigoh;

import utils.PrintUtils;

/**
 * These examples are amended for java and taken from from : 
 * http://rob-bell.net/2009/06/a-beginners-guide-to-big-o-notation/
 * 
 */
public class Driver extends PrintUtils{
	
	public static void main(String args[]){

		String[] elements = {"test"};
		for(int counter = 0; counter < 100; ++counter){			
			long time1 = getTime();
			println(time1);
			isFirstElementNull(elements);
			long time2 = getTime();
			println(time2);
			println("time is "+String.valueOf(time2-time1));
		}
	}
	
	/**
	 * 
	 * O(1) describes an algorithm that will always execute in the 
	 * same time (or space) regardless of the size of the input data set.
	 * @param strings
	 * @return
	 */
	private static boolean isFirstElementNull(String[] strings)
	{
		if(strings[0] == null)
		{
			return true;
		}
		return false;
	}
}
