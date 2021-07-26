
public class Task09 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i + j == n - 1) {
					mas[i][j] = i + 1;
				}
			}
		}
		for (int i = 3; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i + j == n - 1) {
					mas[i][j] = j+1;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
