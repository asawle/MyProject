package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sumoff{
	public static void main(String[] args) {
	
		String str = "This Ajit is Ajit Sawle This Sawle";

		Set<String> set=  new HashSet<>();
		
		List<String>list= Arrays.stream(str.split(" ")).collect(Collectors.toList());
		List<String> dw=list.stream().filter(e->!set.add(e)).collect(Collectors.toList());
		System.out.println(dw);
		Map<Object, Long> wwc=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(wwc);
		
		
	}
}