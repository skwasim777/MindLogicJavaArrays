package ArraysProgram;

public class DuplicatesElement {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 3, 4, 5, 3, 4, 5, 6, 1, 6 };
		System.out.println("Duplicates Element in the given array");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] == a[i])
					System.out.println(a[j] + " ");

			}
		}
	}
}
