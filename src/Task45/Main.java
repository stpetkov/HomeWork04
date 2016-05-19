package Task45;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[]={2,7,12,5,45,37};
		Arrays.sort(array);
		
		System.out.println("The index of the first number is "+Arrays.binarySearch(array, 4));

	}

}
