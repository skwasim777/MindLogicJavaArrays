package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementsSecondApproach {
		public static void main(String[] args) {
			ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4));
			LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(array);
			ArrayList<Integer> array1 = new ArrayList<Integer>(hashSet);
			System.out.println(array1);

		}
}
