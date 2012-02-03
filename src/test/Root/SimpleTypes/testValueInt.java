package test.Root.SimpleTypes;

import junit.framework.TestCase;
import Root.SimpleTypes.ValueChar;
import Root.SimpleTypes.ValueInt;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 21:26
 */
public class testValueInt extends TestCase{
    public void testConstructor() {
        ValueInt value = new ValueInt(1);
        assertEquals(value.getClass(), ValueChar.class);
    }

    public void testToString() {
        ValueInt value = new ValueInt(1);
        assertEquals(value.toString(), "1");
    }

    public void testClone() {
        ValueInt value1 = new ValueInt(1);
        ValueInt value2 = (ValueInt) value1.clone();

        assertNotSame(value1, value2);
    }

    public void testEquals1() {
        ValueInt value1 = new ValueInt(1);
        ValueInt value2 = (ValueInt) value1.clone();

        assertTrue(value1.equals(value2));
    }

    public void testEquals2() {
        ValueInt value1 = new ValueInt(1);
        String value2 = "1";

        assertTrue(value1.equals(value2));
    }

    public void testEquals3() {
        ValueInt value1 = new ValueInt(1);
        ValueInt value2 = new ValueInt(1);

        assertTrue(value1.equals(value2));
    }

    public void testEquals4() {
        ValueInt value1 = new ValueInt(1);
        ValueInt value2 = new ValueInt(1);

        assertFalse(value1.equals(value2));
    }

    public void testEquals5() {
        ValueInt value1 = new ValueInt(1);
        assertFalse(value1.equals(value1));
    }

    public void testEquals6() {
        ValueInt value1 = new ValueInt(1);
        assertFalse(value1.equals(null));
    }

    public void testEquals7() {
        ValueInt value1 = new ValueInt(1);
        ValueInt value2 = new ValueInt(2);
        assertFalse(value1.equals(value2));
    }
}
