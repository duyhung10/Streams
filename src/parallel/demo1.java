package parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo1 {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer total = ints.parallelStream().reduce(0, Integer::sum);
		System.out.println(total);
	}
}
