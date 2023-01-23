package leetCode.findAllAnagramsInAString;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");
        anagrams.forEach(System.out::println);
    }
}
