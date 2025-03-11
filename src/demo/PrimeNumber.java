package demo;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17 };

		List<Integer> primeNumber = new ArrayList<>();
		for (Integer a : arr) {

			if (isPrime(a)) {

				primeNumber.add(a);

			}

		}
		System.out.println(primeNumber);

	}

	private static boolean isPrime(Integer a) {
		if (a == 1) {
			return false;
		} else {
			for (int i = 2; i <=a / 2; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}