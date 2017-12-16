import static java.lang.Integer.*;

public class Calculator {
    public int calculate(String number) {
        if (number.isEmpty()) return 0;
        if (number.contains(",")) {
            String[] split = getStringsDelimitedByComma(number);
            return getAnIntSummingTwoNumbers(split);
        }
        if(number.contains("\n")){
            String[] split = number.split("\n");
            return getAnIntSummingTwoNumbers(split);
        }
        return parseInt(number);
    }

    private int getAnIntSummingTwoNumbers(String[] split) {
        return parseInt(split[0]) + parseInt(split[1]);
    }

    private String[] getStringsDelimitedByComma(String number) {
        return number.split(",");
    }
}
