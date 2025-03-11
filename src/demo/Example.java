package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		
		String str="Ajit";
		
		List<String> ls=Arrays.asList(str.split(""));
		System.out.println(ls);
		
		Map<String, Long> count=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(count);
		

	}

}