package Task49;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 6 };
		int[] rev = new int[arr.length];
		rev = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rev[arr.length - i - 1];
		}
		System.out.print(Arrays.toString(arr));
	}
	

}
