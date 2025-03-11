package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int n=5;
		
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		
	}

}
