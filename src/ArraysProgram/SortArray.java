package ArraysProgram;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2, 6, 7, 8, 10, 9 };
		int temp = 0;
		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
