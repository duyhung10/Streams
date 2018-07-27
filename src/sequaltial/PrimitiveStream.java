package sequaltial;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {
	public static void main(String[] args) {
        IntStream.range(1, 4).forEach(System.out::println);
        System.out.println("--------");
        
        IntStream.of(1, 2, 3).forEach(System.out::println);
        System.out.println("--------");
 
        DoubleStream.of(1, 2, 3).forEach(System.out::println);
        System.out.println("--------");
 
        LongStream.range(1, 4).forEach(System.out::println);
        System.out.println("--------");
 
        LongStream.of(1, 2, 3).forEach(System.out::println);
    }
}
