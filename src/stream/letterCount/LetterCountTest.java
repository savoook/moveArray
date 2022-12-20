package stream.letterCount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static stream.letterCount.LetterCount.getTotalNumberOfLettersOfNamesLongerThanFive;

public class LetterCountTest {

    @Test
    public void test() {
        System.out.println("Testing if [william, jones, aaron, seppe, frank, gilliam] returns 14");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam"), 14);

        System.out.println("Testing if [aaron] returns 0");
        assertEquals(getTotalNumberOfLettersOfNamesLongerThanFive("aaron"), 0);
    }
}