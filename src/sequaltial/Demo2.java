package sequaltial;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30), new Person("jack", 20), new Person("lawrence", 40));

		Person result1 = persons.stream().filter(x -> "jack".equals(x.getName())).findAny().orElse(null);
		System.out.println(result1);

		Person result2 = persons.stream().filter(x -> "ahmook".equals(x.getName())).findAny().orElse(null);
		System.out.println(result2);
		
		Person result3 = persons.stream().filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge()).findAny().orElse(null);
		System.out.println(result3);
	}
}

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}