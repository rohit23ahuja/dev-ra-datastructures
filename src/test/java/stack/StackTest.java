package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void givenStack_thenLastItemIsPopped(){
        Stack s = new Stack(3);
        s.push(4);
        s.push(8);
        s.push(12);
        assertEquals(12, s.pop());
    }

    @Test
    public void givenStack_whenCapacity1_thenLastItemIsPopped(){
        Stack s = new Stack(1);
        s.push(5);
        s.pop();
        s.push(9);
        assertEquals(9, s.pop());
    }

    @Test
    public void givenStack_whenCapacityFull_thenThrowIllegalArgumentException(){
        Stack s = new Stack(2);
        s.push(8);
        s.push(2);
        assertThrows(IllegalArgumentException.class, () -> s.push(1));
    }

    @Test
    public void givenStack_whenEmpty_thenThrowIllegalArgumentException(){
        Stack s = new Stack(1);
        s.push(3);
        assertThrows(IllegalArgumentException.class, ()->s.push(2));
    }

    @Test
    public void givenStack_thenCorrectSizeShouldBeReturned(){
        Stack s = new Stack(3);
        s.push(4);
        assertEquals(1, s.size());
        s.push(1);
        assertEquals(2, s.size());
        s.push(7);
        assertEquals(3, s.size());
    }

    @Test
    public void givenStack_whenIllegalCapacity_thenThrowIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> new Stack(0));
    }
}
