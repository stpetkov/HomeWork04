package Task47;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 4, 66, 2, 6, 22 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Which number are you looking for : ");
		int n = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.print("The index of number " + n + " is (" + i +") ");
			}
		}

	}

}
