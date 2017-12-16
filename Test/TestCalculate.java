import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestCalculate {

    @Test
    public void emptyStringReturnsZero() {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void givenSingleNumberExpectedReturnsTheSameNumber() {
        Calculator calculator = new Calculator();

        assertEquals(27, calculator.calculate("27"));
    }

}
