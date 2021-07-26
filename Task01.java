public class Task01 {

	public static void main(String[] args) {
		int[] ar = new int[] { 28, 83, 76, 32, 43, 75, 63, 94, 65 };

		int chet = 0;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0)
				chet++;
		}
		if (chet == 0)
			System.out.println("Четных чисел нет.");

		int[] chetPositionsArray = new int[chet];
		for (int i = 0, j = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				chetPositionsArray[j++] = i;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		System.out.println();
		for (int i = 0; i < chetPositionsArray.length; i++) {
			System.out.printf("{%d}", chetPositionsArray[i]);
		}
	}
}
