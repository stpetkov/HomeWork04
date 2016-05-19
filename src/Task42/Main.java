package Task42;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the size of the array : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		int fib1 = 0;
		int fib2 = 1;
		int fib = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = fib;
			fib = fib2 + fib1;
			fib1 = fib2;
			fib2 = fib;
		}
		System.out.print(Arrays.toString(array));
	}

}
