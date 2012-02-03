package test.Statistics.Generators;

import junit.framework.TestCase;
import Statistics.Generators.ConstanteGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 21:40
 */
public class testConstantGenerator extends TestCase{
    public void testConstructor() {
        ConstanteGenerator generator = new ConstanteGenerator(10);
        assertEquals(generator.getClass(), ConstanteGenerator.class);
    }

    public void testGetInt() {
        ConstanteGenerator generator = new ConstanteGenerator(10);
        assertEquals(generator.getNextInt(), 10);
        assertEquals(generator.getNextInt(), 10);
    }
}
