package Task46;

public class Main {

	public static void main(String[] args) {
		int array1[] = { 2, 4, 5, 1, 12, 3, 7, 6, 18, 20 };
		int c, d, swap;
		for (c = 0; c < (array1.length - 1); c++) {
			for (d = 0; d < array1.length - c - 1; d++) {
				if (array1[d] > array1[d + 1]) {
					swap = array1[d];
					array1[d] = array1[d + 1];
					array1[d + 1] = swap;
				}
			}
		}
		System.out.print("Sorted list of numbers : ");

		for (c = 0; c < array1.length; c++) {
			System.out.print(array1[c] + " , ");
		}
	}
}
