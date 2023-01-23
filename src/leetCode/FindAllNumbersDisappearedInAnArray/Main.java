package leetCode.FindAllNumbersDisappearedInAnArray;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> numbers = solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        for (Integer n : numbers) System.out.print(n + " ");
    }
}
