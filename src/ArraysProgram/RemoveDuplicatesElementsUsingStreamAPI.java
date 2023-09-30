package ArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesElementsUsingStreamAPI {
		public static void main(String[] args) {
			ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(2,2,3,3));
			List<Integer> list = array.stream().distinct().collect(Collectors.toList());
			System.out.println(list);
		}
}
