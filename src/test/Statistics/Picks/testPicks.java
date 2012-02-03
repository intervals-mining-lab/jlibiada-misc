package test.Statistics.Picks;

import junit.framework.TestCase;
import Statistics.Picks.Picks;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 22:48
 */
public class testPicks extends TestCase{
    public void testHasNext() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertTrue(picks.hasNext());
        picks.next();
        assertTrue(picks.hasNext());
        picks.next();
        assertFalse(picks.hasNext());
    }

    public void testNext() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertEquals(picks.next(), 0.2);
        assertEquals(picks.next(), 0.1);
    }

    public void testRemove() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        picks.remove();
        assertEquals(picks.next(), 0.2);
        assertTrue(picks.hasNext());
    }

    public void testResetIterator() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertEquals(picks.next(), 0.2);
        assertEquals(picks.next(), 0.1);
        picks.resetIterator();
        assertEquals(picks.next(), 0.2);
        assertEquals(picks.next(), 0.1);
    }

    public void testSort() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.25);
        picks.add(0.1);
        assertEquals(picks.next(), 0.2);
        assertEquals(picks.next(), 0.25);
        assertEquals(picks.next(), 0.1);
        picks.resetIterator();
        picks.sort();
        assertEquals(picks.next(), 0.1);
        assertEquals(picks.next(), 0.2);
        assertEquals(picks.next(), 0.25);
    }

    public void testGetIndex() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertEquals(picks.getIndex(), 0);
        picks.next();
        assertEquals(picks.getIndex(), 1);
    }

    public void testSize() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertEquals(picks.size(), 2);
    }

    public void testGet() {
        Picks picks = new Picks();
        picks.add(0.2);
        picks.add(0.1);
        assertEquals(picks.get(0), 0.2);
        assertEquals(picks.get(1), 0.1);
    }
}
