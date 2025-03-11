package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenNum=numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evenNum);

		numbers.forEach(num -> {
			if (num % 2 == 0) {
				System.out.println(num+" even number");
			} else {
				System.out.println(num+" odd number");
			}
		});

	}
}
