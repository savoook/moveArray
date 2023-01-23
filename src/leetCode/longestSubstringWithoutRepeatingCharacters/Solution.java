package leetCode.longestSubstringWithoutRepeatingCharacters;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        SortedSet<String> set = new TreeSet<>(Comparator.comparing(String::length).reversed());
        String subStr = "";
        for (int i = 0, j = 0; i < array.length; i++) {
            if (!subStr.contains(array[i] + "")) {
                subStr = subStr + array[i];
            } else {
                set.add(subStr);
                subStr = array[j++] + "";
            }
        }
        set.add(subStr);
        return set.isEmpty() ? 0 : set.iterator().next().length();
    }
}
