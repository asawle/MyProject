package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordCount {

	public static void main(String[] args) {

		String str = "This is Ajit This is Ajit Rahul";

		Set<String> set = new HashSet<>();

		List<String> listStr = Arrays.stream(str.split(" ")).collect(Collectors.toList());

		List<String> duplicate = listStr.stream().filter(e -> !set.add(e)).collect(Collectors.toList());
		System.out.println(duplicate);

		Map<Object, Long> wc = listStr.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(wc);

		Map<Object, Object> dwc = wc.entrySet().stream().filter(e -> e.getValue() > 1)
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(dwc);
	}

}
