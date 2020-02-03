package eecs2311.junit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter c;
    
    @BeforeEach
    public void setUp() throws Exception {
        c = new Counter();
    }
    
    @Test
    public void counterIntialization() {
    	assertNotNull(c);
    }


    @Test
    public void testIncrement() {
        assertEquals(1,c.increment());
        assertEquals(2,c.increment());
    }

    @Test
    public void testDecrement() {
        assertEquals(-1,c.decrement());
        assertEquals(-2,c.decrement());
    }
    
    @Test
    public void testReset() {
    	c.decrement();
        assertEquals(0,c.reset());
    }
    
    public void testIncrementArgs() {
        assertEquals(4,c.increment(4));
        assertEquals(6,c.increment(2));
    }

    @Test
    public void testDecrementArgs() {
        assertEquals(-4,c.decrement(4));
        assertEquals(-6,c.decrement(2));
    }
    
    @Test
    public void testAllMethods() {
        assertEquals(4,c.increment(4));
        assertEquals(6,c.increment(2));
        assertEquals(0,c.reset());
        assertEquals(-4,c.decrement(4));
        assertEquals(-6,c.decrement(2));
    }
}