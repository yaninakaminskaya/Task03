import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		int[] mas = new int[6];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		int min, temp;
		for (int i = 0; i < mas.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[min]) {
					min = j;
				}
			}
			temp = mas[i];
			mas[i] = mas[min];
			mas[min] = temp;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}
		System.out.println();
		System.out.println("От " + mas[0] + " до " + mas[5]);
	}
}