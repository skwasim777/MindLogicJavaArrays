package ArraysProgram;

import java.util.HashSet;
import java.util.Set;

/*
 * remove duplicates elements from array 
 * input --> {1,2,2,3,3,4,4}
 * 
 * output should be 
 * {1,2,3,4}
 *  using set interface 
 */

public class RemoveDuplicatesArrayElements {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int len = a.length;
		Set set = new HashSet();
		for (int i = 0; i < len; i++) {
			set.add(a[i]);

		}
		System.out.println(set);

	}
}
