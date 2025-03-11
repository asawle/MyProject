package demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String input = "swists";
		List<String> list = Arrays.stream(input.toLowerCase().split("")).collect(Collectors.toList());
		Map<Character, Long> wcount = input.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Object fnrc = wcount.entrySet().stream().filter(e -> e.getValue() == 1).map(ev -> ev.getKey()).findFirst()
				.get();
		System.out.println(fnrc);

		Object fnrc2 = wcount.entrySet().stream().filter(e -> e.getValue() == 1).map(a -> a.getKey())
				.map(String::valueOf).collect(Collectors.joining());

		System.out.println(fnrc2);
	}
}
