package ArraysProgram;

public class RightRotateTheArrayElements {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int n = 3;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			int last, j;
			last = a[a.length - 1];
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
