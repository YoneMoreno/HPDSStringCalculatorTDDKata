import static java.lang.Integer.*;

public class Calculator {
    public int calculate(String number) {
        if (number.isEmpty()) return 0;

        if (number.contains(",")) {
            String[] split = getStringsDelimitedBy(",", number);
            return getAnIntSummingTwoNumbers(split);
        }
        if (number.contains("\n")) {
            String[] split = getStringsDelimitedBy("\n", number);
            return getAnIntSummingTwoNumbers(split);
        }
        return parseInt(number);
    }

    private int getAnIntSummingTwoNumbers(String[] split) {
        return parseInt(split[0]) + parseInt(split[1]);
    }

    private String[] getStringsDelimitedBy(String delimiter, String number) {
        return number.split(delimiter);
    }
}
