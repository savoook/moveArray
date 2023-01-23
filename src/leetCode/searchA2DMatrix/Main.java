package leetCode.searchA2DMatrix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23, 24}};
        int target = 19;
        System.out.println(solution.searchMatrix(matrix, target));
    }
}
