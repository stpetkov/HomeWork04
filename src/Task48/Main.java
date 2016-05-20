package Task48;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
		  array[i] = sc.nextInt();
		}
		boolean symmetric = true;
		for (int i = 0; i < (array.length + 1) / 2; i++) {
		  if (array[i] != array[n - i - 1])
		  symmetric = false;
		}
		System.out.print("Symmetric? "+ symmetric);
	}

}
