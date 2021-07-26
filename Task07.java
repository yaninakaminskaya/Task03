import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int n = 5;
		int[][] mas = new int[n][n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		int temp;
		for (int i = 0; i < mas.length; i++) {
			temp = mas[i][i];
			System.out.print(temp + "  ");
			
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();

		}
		System.out.println();
	}
}
