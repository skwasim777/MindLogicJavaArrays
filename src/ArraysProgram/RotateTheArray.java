package ArraysProgram;

public class RotateTheArray {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		int n = 3;
		System.out.println("Original Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// rotate the array three times of left side
		for (int i = 0; i < 3; i++) {
			 int first = a[0], j;
			for (j = 0; j < a.length-1; j++) {
				a[j] = a[j + 1];

			}
			a[j] = first;
		}
		System.out.println();
		System.out.print("Rotate Array");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}
