package stream.getTheNamesOfAllKidsUnderTheAgeOf18;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static stream.getTheNamesOfAllKidsUnderTheAgeOf18.UnderAge.getKidNames;
import static org.assertj.core.api.Assertions.assertThat;

public class UnderAgeTest {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(getKidNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }
}