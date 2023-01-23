package leetCode.generateParentheses;

public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        for (String s : solution.generateParenthesis(3)) System.out.print(s+"  ");
    }
}
