package test.Root.SimpleTypes;

import junit.framework.TestCase;
import main.Root.SimpleTypes.ValueString;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 21:29
 */
public class testValueString extends TestCase{
    public void testConstructor() {
        ValueString value = new ValueString("1");
        assertEquals(value.getClass(), ValueString.class);
    }

    public void testToString() {
        ValueString value = new ValueString("1");
        assertEquals(value.toString(), "1");
    }

    public void testClone() {
        ValueString value1 = new ValueString("1");
        ValueString value2 = (ValueString) value1.clone();

        assertNotSame(value1, value2);
    }

    public void testEquals1() {
        ValueString value1 = new ValueString("1");
        ValueString value2 = (ValueString) value1.clone();

        assertTrue(value1.equals(value2));
    }

    public void testEquals2() {
        ValueString value1 = new ValueString("1");
        String value2 = "1";

        assertTrue(value1.equals(value2));
    }

    public void testEquals3() {
        ValueString value1 = new ValueString("1");
        ValueString value2 = new ValueString("1");

        assertTrue(value1.equals(value2));
    }

    public void testEquals4() {
        ValueString value1 = new ValueString("1");
        ValueString value2 = new ValueString("1");

        assertFalse(value1.equals(value2));
    }

    public void testEquals5() {
        ValueString value1 = new ValueString("1");
        assertFalse(value1.equals(value1));
    }

    public void testEquals6() {
        ValueString value1 = new ValueString("1");
        assertFalse(value1.equals(null));
    }

    public void testEquals7() {
        ValueString value1 = new ValueString("1");
        ValueString value2 = new ValueString("2");
        assertFalse(value1.equals(value2));
    }
}
