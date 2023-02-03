package testTasks.deepCopy;

import com.rits.cloning.Cloner;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DeepCopyTest {

    @Test
    public void copyTest() {
        Man man1 = new Man("Pavel", 35, List.of("Book", "Book2"));
        Cloner cloner = new Cloner();
        Man man2 = cloner.deepClone(man1);
        //Man man2 = (Man) DeepCopy.copy(man1);
        Assert.assertEquals(man1, man2);
    }
}