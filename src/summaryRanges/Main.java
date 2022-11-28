package summaryRanges;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        strings.forEach(s-> System.out.print(s+" "));
    }
}
