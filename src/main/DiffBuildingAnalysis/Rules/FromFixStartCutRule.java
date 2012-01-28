package main.DiffBuildingAnalysis.Rules;

import main.DiffBuildingAnalysis.Iterators.CutRuleIterator;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 18.10.11
 * Time: 13:23
 * To change this template use File | Settings | File Templates.
 */
public class FromFixStartCutRule extends CutRule {
    public FromFixStartCutRule(int length, int step) {
         for (int i=1 ; i<=length/step; i++)
         {
             starts.add(1);
             stops.add(i*step);
         }
    }

    @Override
    public CutRuleIterator getIterator() {
        return new CutRuleIterator(starts, stops);
    }
}
