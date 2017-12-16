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
        checkIfIsNegative(number);
        return parseInt(number);
    }

    private void checkIfIsNegative(String number) throws NegativeNumberException {
        if (IsNegative(number)) {
            throw new NegativeNumberException();
        }
    }

    private boolean IsNegative(String number) {
        return Integer.parseInt(number) < 0;
    }

    private int getAnIntSummingTwoNumbers(String[] split) throws NegativeNumberException {
        int result = 0;
        for (String number : split) {
            checkIfIsNegative(number);
            if (IsNumberHigherEqual1000(number)) continue;
            result += Integer.parseInt(number);
        }
        return result;
    }

    private boolean IsNumberHigherEqual1000(String number) {
        return Integer.parseInt(number) >= 1000;
    }

    private String[] getStringsDelimitedBy(String delimiter, String number) {
        return number.split(delimiter);
    }
}
