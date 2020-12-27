package leetCode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			List<String> value = map.getOrDefault(key, new ArrayList<>());
			value.add(str);
			map.put(key, value);
		}

		return new ArrayList<>(map.values());
	}
}