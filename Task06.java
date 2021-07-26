public class Task06 {
	
	public static void main(String[] args) {
		int[][] mas = new int[][] { { 15, 7, 3, 7 }, { 7, 7, 33, 8 }, { 1, 12, 7, 98 }, { 46, 55, 4, 0 }, { 6, 7, 14, 72 }};

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		int temp = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					temp++;
				}

			}

		}
		System.out.print("Число 7 встречается " + temp + " раз.");
	}
}
