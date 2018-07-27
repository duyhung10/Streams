package sequaltial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("one", "two", "three", "four", "five" );
		List<String> resuilt = items.stream().filter(i -> i.startsWith("t")).collect(Collectors.toList());
		
		resuilt.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 8, 1);
		Stream<Integer> streamInt = numbers.stream();
		long count = streamInt.filter(num -> (num % 2 == 0)).count();
		System.out.println(count);
        System.out.println("---------");

		List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		// map() ánh xạ các phần tử tới kết quả tương ứng
        data.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        // data.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println(data);
        System.out.println("---------");
        
        data.stream().sorted().forEach(System.out::println);
        System.out.println("---------");
        
        data.stream().sorted((str1, str2) -> str1.length() - str2.length()).forEach(System.out::println);
	}
}
