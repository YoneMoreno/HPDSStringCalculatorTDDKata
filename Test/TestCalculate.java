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
    public void emptyStringReturnsZero() throws NegativeNumberException {

        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void givenSingleNumberExpectedReturnsTheSameNumber() throws NegativeNumberException {

        assertEquals(27, calculator.calculate("27"));
    }


    @Test
    public void givenTwoNumberDelimitedByCommaExpectedTheSum() throws NegativeNumberException {

        assertEquals(150, calculator.calculate("100,50"));
    }

    @Test
    public void givenTwoNumbersDelimitedByNewlineExpectedTheSum() throws NegativeNumberException {

        assertEquals(12, calculator.calculate("4\n8"));
    }


    @Test
    public void threeNumbersDelimitedEitherWayExpectedTheSum() throws NegativeNumberException {

        assertEquals(6, calculator.calculate("1,2,3"));
        assertEquals(6, calculator.calculate("1\n2\n3"));
    }


    @Test(expected = NegativeNumberException.class)
    public void givenNegativeNumberThrowsException() throws NegativeNumberException

    {
        calculator.calculate("-1");

    }

    @Test(expected = NegativeNumberException.class)
    public void givenTwoNegativeNumberThrowsException() throws NegativeNumberException

    {
        calculator.calculate("-1,-2");
    }

}
