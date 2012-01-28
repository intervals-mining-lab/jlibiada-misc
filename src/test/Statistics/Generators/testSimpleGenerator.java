package test.Statistics.Generators;

import junit.framework.TestCase;
import main.Statistics.Generators.SimpleGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 21:53
 */
public class testSimpleGenerator extends TestCase{
    public void testConstructor() {
        SimpleGenerator generator = new SimpleGenerator(0, 1);
        assertEquals(generator.getClass(), SimpleGenerator.class);
    }

    public void testGetInt() {
        SimpleGenerator generator = new SimpleGenerator(0, 1);
        for (int i = 0; i < 100; i++) {
            int value = generator.getNextInt();
            assertTrue(value < 1 && value > 0);
        }
    }
}
