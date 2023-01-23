package leetCode.implementQueueUsingStacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyQueueTest {
    MyQueue myQueue = new MyQueue();

    @Before
    public void setUp() throws Exception {
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    }

    @Test
    public void test() {
        assertEquals(myQueue.peek(), 1);
        assertEquals(myQueue.pop(), 1);
        assertFalse(myQueue.empty());
    }
}