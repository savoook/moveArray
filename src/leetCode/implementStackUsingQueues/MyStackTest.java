package leetCode.implementStackUsingQueues;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyStackTest {
    private static MyStack myStack = new MyStack();

    @BeforeClass
    public static void init(){
        myStack.push(1);
        myStack.push(2);
    }
    @Test
    public void test() {
        assertEquals(myStack.top(), 2);
        assertEquals(myStack.pop(), 2);
        assertFalse(myStack.empty());
    }
}