package demo;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorial {

	public static void main(String[] args) {

		int num = 4;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			
			fact = fact * i;
			
		}

		System.out.println("Factorial of given number is " + fact);
		
		Integer i=IntStream.rangeClosed(1, num).reduce(1, (a,b)->a*b);
		System.out.println(i);
		Integer max= IntStream.range(1, 5).reduce(Integer::min).getAsInt();
		System.out.println(max);
	}
	

}
