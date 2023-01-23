package leetCode.repeatedSubstringPattern;

public class Solution2 {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) < s.length();
    }
}
