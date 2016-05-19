package Task44;

public class Main {

	public static void main(String[] args) {
		int array[][]=new int[6][5];
		int a=30;
		for(int j=0;j<=array.length;j++){
			for(int i=0;i<=array[j].length;i++){
				array[i][j]=a--;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
