public class Task04 {

	public static void main(String[] args) {
		int[] mas = { 325, 420, 125, 500, 222 };
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println();
		
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
					sorted = false;
				}
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println();
	}

}
