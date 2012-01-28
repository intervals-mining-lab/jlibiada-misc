package test.Statistics.Generators;

import junit.framework.TestCase;
import main.Statistics.Generators.MockGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 21:47
 */
public class testMockGenerator extends TestCase {
    public void testConstructor() {
        MockGenerator generator = new MockGenerator(0, 1);
        assertEquals(generator.getClass(), MockGenerator.class);
    }

    public void testGetInt() {
        MockGenerator generator = new MockGenerator(0, 1);
        assertEquals(generator.getNextInt(), 1);
        assertEquals(generator.getNextInt(), 4);
        assertEquals(generator.getNextInt(), 12);
        assertEquals(generator.getNextInt(), 5);
    }
}
