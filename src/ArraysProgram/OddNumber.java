package ArraysProgram;

public class OddNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i = i + 2) {
			System.out.println(a[i] + " ");
		}
	}
}
