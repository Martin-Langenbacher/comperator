import java.util.Arrays;

public class Comparator {

	public static void main(String[] args) {
		
		// 1. Sort an Array
		
		String[] fruits = new String[] {"Pinapple", "Apple", "Orange", "Banana", "Mango" };
		
		Arrays.parallelSort(fruits);
		
		int i = 0;
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp);
		}
		
		
		
		
		
		
		
		
		// 2. Sort an ArrayList
		
		
		
		
		
		
		// 3. Sort an Object with Comparable
		
		
		
		// 4. Sort an Object with Comparator
		
		
		
	}

}
