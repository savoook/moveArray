package stream.letterCount;

import java.util.Arrays;

public class LetterCount {
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).filter(n -> n.length() > 5).mapToInt(String::length).sum();
    }
}
