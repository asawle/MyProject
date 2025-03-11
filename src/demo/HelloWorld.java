package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class HelloWorld {

	public static void main(String[] args) {

		String[] strs = { "listen", "silent", "enlist", "rat", "tar", "god", "dog", "evil", "vile", "flee" };

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {

			char[] charArray=str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr= new String(charArray);
			map.computeIfAbsent(sortedStr, k->new ArrayList<>()).add(str);   

		}
		
		List<String> largestgroup= new ArrayList<>();
		for(List<String> group: map.values()) {
			if(group.size()>largestgroup.size()) {
				largestgroup=group;
			}
		}
		
		System.out.println(largestgroup);
		

	}
}