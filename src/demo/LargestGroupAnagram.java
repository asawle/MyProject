package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestGroupAnagram {

	public static void main(String[] args) {

		String[] strs = { "listen", "silent", "enlist", "rat", "tar", "god", "dog", "evil", "vile", "flee" };

		Map<String, List<String>> anagramGroups = new HashMap<>();

		for (String str : strs) {

			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);

		}

		List<String> largestGroup = new ArrayList<>();
		for (List<String> group : anagramGroups.values()) {
			if (group.size() > largestGroup.size()) {
				largestGroup = group;
			}
		}
		System.out.println(largestGroup.toString());
	}

}
