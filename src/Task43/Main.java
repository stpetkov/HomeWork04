package Task43;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 10;
		}
		System.out.print(Arrays.toString(array));
	}

}
