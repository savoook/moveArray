package leetCode.quickSort;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, -3, 1, 30, 14, -200, 500, -120};
        solution.sort(array);
        int count = 0;
        for (int num : array) {
            String del = count != array.length - 1 ? ", " : "";
            System.out.print(num + del);
            count++;
        }
    }
}
