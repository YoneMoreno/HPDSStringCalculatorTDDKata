import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestCalculate {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void emptyStringReturnsZero() {

        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void givenSingleNumberExpectedReturnsTheSameNumber() {

        assertEquals(27, calculator.calculate("27"));
    }

}
