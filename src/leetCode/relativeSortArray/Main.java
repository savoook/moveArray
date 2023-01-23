package leetCode.relativeSortArray;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{2, 5, 3, 8, 4, 6, 2, 6, 1, 8, 4, 9, 6};
        int[] arr2 = new int[]{8, 6, 2};
        solution.relativeSortArray(arr1, arr2);
        //ollections.singletonList(arr1).forEach(System.out::println);
        for (int i : arr1) System.out.print(i + " ");
    }
}
