package stream.challenge;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static String getString(List<Integer> list) {
        return list.stream().map(x -> x % 2 == 0 ? "e" + x : "o" + x).collect(Collectors.joining(","));
    }
}
