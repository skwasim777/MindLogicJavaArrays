package ArraysProgram;

public class SmallestNumber {
	public static int smallestNumber(int a[], int total) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0];

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("smallest number " + smallestNumber(a, 5));

	}
}
