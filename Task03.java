public class Task03 {
	public static void main(String[] args) {
		int[] mas = new int[] { -200, 155, 0, -2, 34, 61, 0, -12, 0, -7, 0, -74 };

		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				temp1++;
			} 
			else if (mas[i] < 0) {
				temp2++;
			} 
			else if (mas[i] > 0) {
				temp3++;
			}
		}
		
		System.out.println("Нулевых элементов: " + temp1);
		System.out.println("Отрицательных элементов: " + temp2);
		System.out.println("Положительных элементов: " + temp3);
	}
}
