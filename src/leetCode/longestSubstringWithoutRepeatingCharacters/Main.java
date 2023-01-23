package leetCode.longestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        //Solution solution = new Solution();
        Solution2 solution = new Solution2();
        //int result = solution.lengthOfLongestSubstring("abcabcbb");
        //int result = solution.lengthOfLongestSubstring("pwwkew");
        //int result = solution.lengthOfLongestSubstring("");
        //int result = solution.lengthOfLongestSubstring(" ");
        int result = solution.lengthOfLongestSubstring("dvdf");
        System.out.println(result);
    }
}
