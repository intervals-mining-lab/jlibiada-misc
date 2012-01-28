package test.Root.SimpleTypes;

import junit.framework.TestCase;
import main.Root.SimpleTypes.ValueChar;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 20:39
 */
public class testValueChar extends TestCase{
    public void testConstructor() {
        ValueChar value = new ValueChar('1');
        assertEquals(value.getClass(), ValueChar.class);
    }

    public void testToString() {
        ValueChar value = new ValueChar('1');
        assertEquals(value.toString(), "1");
    }

    public void testClone() {
        ValueChar value1 = new ValueChar('1');
        ValueChar value2 = (ValueChar) value1.clone();

        assertNotSame(value1, value2);
    }

    public void testEquals1() {
        ValueChar value1 = new ValueChar('1');
        ValueChar value2 = (ValueChar) value1.clone();

        assertTrue(value1.equals(value2));
    }

    public void testEquals2() {
        ValueChar value1 = new ValueChar('1');
        String value2 = "1";

        assertTrue(value1.equals(value2));
    }

    public void testEquals3() {
        ValueChar value1 = new ValueChar('1');
        ValueChar value2 = new ValueChar('1');

        assertTrue(value1.equals(value2));
    }

    public void testEquals4() {
        ValueChar value1 = new ValueChar('1');
        ValueChar value2 = new ValueChar('1');

        assertFalse(value1.equals(value2));
    }

    public void testEquals5() {
        ValueChar value1 = new ValueChar('1');
        assertFalse(value1.equals(value1));
    }

    public void testEquals6() {
        ValueChar value1 = new ValueChar('1');
        assertFalse(value1.equals(null));
    }

    public void testEquals7() {
        ValueChar value1 = new ValueChar('1');
        ValueChar value2 = new ValueChar('2');
        assertFalse(value1.equals(value2));
    }
}
