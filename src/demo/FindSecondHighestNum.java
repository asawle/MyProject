package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindSecondHighestNum {

	public static void main(String[] args) {

		int[] numbers = { 15, 17, 8, 4, 20, 18, 40, 5, 6, 1 };

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		int l = numbers.length - 2;

		System.out.println(numbers[l]);

		Integer sh = Arrays.stream(numbers).distinct().boxed().sorted((a, b) -> a-b).skip(2).findFirst()
				.map(Integer::intValue).get();
		System.out.println(sh);
	}

}
