package Task41;

public class Main {

	public static void main(String[] args) {
		int array[] = { 2, 4, 5, 6, 7, 8, 23, 24, 26, 40 };
		int sum = 0;
		for (int a : array) {
			if (a % 2 == 0) {
				System.out.print(a+" , ");
				sum += a;
			}
		}
		System.out.println("Sum = "+sum);
	}

}
