import static java.lang.Integer.*;

public class Calculator {
    public int calculate(String number) throws NegativeNumberException {
        if (number.isEmpty()) return 0;

        if (number.contains(",")) {
            String[] split = getStringsDelimitedBy(",", number);
            return getAnIntSummingTwoNumbers(split);
        }
        if (number.contains("\n")) {
            String[] split = getStringsDelimitedBy("\n", number);
            return getAnIntSummingTwoNumbers(split);
        }
        if (Integer.parseInt(number) < 0) {
            throw new NegativeNumberException();
        }
        return parseInt(number);
    }

    private int getAnIntSummingTwoNumbers(String[] split) {
        int result = 0;
        for (String number : split) {
            result += Integer.parseInt(number);
        }
        return result;
    }

    private String[] getStringsDelimitedBy(String delimiter, String number) {
        return number.split(delimiter);
    }
}
