import java.util.HashMap;

public class Solution1 {
	//1.暴力解法 排序 nlog(n)
	//2.HashMap log(n)
	//
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
		}
		for (Character character : map.keySet()) {
			if (map.get(character) != 0) {
				return false;
			}
		}
		return true;
	}
}