package main.DiffBuildingAnalysis;

import main.DiffBuildingAnalysis.Iterators.CutRuleIterator;
import main.DiffBuildingAnalysis.Rules.CutRule;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Vladimir
 * Date: 18.10.11
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
public class DifCutter {
    public ArrayList<String> cut(String chain, CutRule rule) {
        ArrayList<String> result =  new ArrayList<String>();

        rule.getIterator();
        CutRuleIterator iterator = rule.getIterator();

        while(iterator.next())
        {
           String s = chain.substring(iterator.getStartPos()-1, iterator.getStopPos());
           result.add(s);
        }
        return result;
    }
}
