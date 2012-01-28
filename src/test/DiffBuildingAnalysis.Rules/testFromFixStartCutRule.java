package test.DiffBuildingAnalysis.Rules;

import junit.framework.TestCase;
import main.DiffBuildingAnalysis.Iterators.CutRuleIterator;
import main.DiffBuildingAnalysis.Rules.FromFixStartCutRule;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 18.10.11
 * Time: 13:02
 * To change this template use File | Settings | File Templates.     
 */
public class testFromFixStartCutRule extends TestCase{
    public void testCutRule() throws Exception {
        FromFixStartCutRule rule = new FromFixStartCutRule(12, 3);
        CutRuleIterator iterator = rule.getIterator(); //объект, который бегает по массиву
        iterator.next();
        assertEquals(iterator.getStartPos(), 1);
        assertEquals(iterator.getStopPos(), 3);
        iterator.next();
        assertEquals(iterator.getStartPos(), 1);
        assertEquals(iterator.getStopPos(), 6);
        iterator.next();
        assertEquals(iterator.getStartPos(), 1);
        assertEquals(iterator.getStopPos(), 9);
        iterator.next();
        assertEquals(iterator.getStartPos(), 1);
        assertEquals(iterator.getStopPos(), 12);
    }
}
