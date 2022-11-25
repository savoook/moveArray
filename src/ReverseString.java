import java.util.Arrays;

public class ReverseString {
    private static StringBuilder reverse(String str) {
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
        }
        return stringBuilder;
    }

    public static void main(String[] args) {
        System.out.println(reverse("pasha"));
    }
}
