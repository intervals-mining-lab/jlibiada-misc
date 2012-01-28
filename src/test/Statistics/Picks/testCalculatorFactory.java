package test.Statistics.Picks;

import junit.framework.TestCase;
import main.Statistics.Picks.CalculatorFactory;
import main.Statistics.Picks.Calculators.PatternRecognition.BetweenPatternDistance;
import main.Statistics.Picks.Calculators.PatternRecognition.ImageCompactDistance;
import main.Statistics.Picks.Calculators.PatternRecognition.InterPatternDistance;
import main.Statistics.Picks.Calculators.PicksCalculator.SamplingCalculator;
import main.Statistics.Picks.Calculators.ValueCalculator.*;
import main.Statistics.Picks.Picks;

/**
 * Created by IntelliJ IDEA.
 * User: alex
 * Date: 28.01.12
 * Time: 22:06
 */
public class testCalculatorFactory extends TestCase{
    public void testGetSampling() {
        SamplingCalculator calculator = (SamplingCalculator) CalculatorFactory.getSampling(7);
        assertEquals(calculator.getClass(), SamplingCalculator.class);
    }

    public void testGetMax() {
        MaxCalculator calculator = (MaxCalculator) CalculatorFactory.getMax();
        assertEquals(calculator.getClass(), MaxCalculator.class);
    }

    public void testGetMin() {
        MinCalculator calculator = (MinCalculator) CalculatorFactory.getMin();
        assertEquals(calculator.getClass(), MinCalculator.class);
    }

    public void testGetExpectation() {
        ExpectationCalculator calculator = (ExpectationCalculator) CalculatorFactory.getExpectation();
        assertEquals(calculator.getClass(), ExpectationCalculator.class);
    }

    public void testGetVariance() {
        VarianceCalculator calculator = (VarianceCalculator) CalculatorFactory.getVariance();
        assertEquals(calculator.getClass(), VarianceCalculator.class);
    }

    public void testGetStandardDeviation() {
        StandardDeviation calculator = (StandardDeviation) CalculatorFactory.getStandardDeviation();
        assertEquals(calculator.getClass(), StandardDeviation.class);
    }

    public void testGetCorelation() throws Exception {
        Corelation calculator = (Corelation) CalculatorFactory.getCorelation(new Picks(), new Picks());
        assertEquals(calculator.getClass(), Corelation.class);
    }

    public void testGetCovariation() throws Exception {
        Covariation calculator = (Covariation) CalculatorFactory.getCovariation(new Picks(), new Picks());
        assertEquals(calculator.getClass(), Covariation.class);
    }

    public void testGetBetweenPatternsDistance() throws Exception {
        BetweenPatternDistance calculator = (BetweenPatternDistance) CalculatorFactory.getBetweenPatternsDistance(new Picks(), new Picks());
        assertEquals(calculator.getClass(), BetweenPatternDistance.class);
    }

    public void testInterPatternDistance() {
        InterPatternDistance calculator = (InterPatternDistance) CalculatorFactory.getInterPatternDistance();
        assertEquals(calculator.getClass(), InterPatternDistance.class);
    }

    public void testImageCompactDistance() {
        ImageCompactDistance calculator = (ImageCompactDistance) CalculatorFactory.getImageCompactDistance(new Picks(), new Picks());
        assertEquals(calculator.getClass(), ImageCompactDistance.class);
    }
}
