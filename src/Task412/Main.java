package Task412;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[i][0] = a;
				array[i][1] = b-16;
				array[i][2] = c-32;
				array[i][3] = d-48;
				d = d+4;
				c = c+4;
				b = b + 4;
				a = a + 4;
				System.out.print(array[i][j] + "        ");
			}
			System.out.println();
		}

	}

}
