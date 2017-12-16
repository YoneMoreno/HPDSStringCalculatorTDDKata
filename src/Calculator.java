public class Calculator {
    public int calculate(String number) {
        if (number.isEmpty()) return 0;
        if (number.contains(",")) {
            String[] split = number.split(",");
            return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
        }
        return Integer.parseInt(number);
    }
}
