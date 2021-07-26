import java.util.Random;

public class Task08 {
	public static void main(String[] args) {
		int[][] mas = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("Вторая строка");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][2]);
		}
		System.out.println();
		System.out.println("Третий столбец");
		for (int j = 0; j < mas.length; j++) {
			System.out.printf("[%4d]", mas[1][j]);
		}
	}
}
