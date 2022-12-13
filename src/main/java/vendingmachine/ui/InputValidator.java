package vendingmachine.ui;

public class InputValidator {

    public static int validateRetainingAmount(String amount) throws IllegalArgumentException {
        int parsedAmount = validateWhetherIntOrNot(amount);
        validateInputRange(parsedAmount);
        validateInputFormat(parsedAmount);
        return parsedAmount;
    }

    private static int validateWhetherIntOrNot(String amount) {
        try {
            return Integer.parseInt(amount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("금액은 정수로만 입력 가능합니다.");
        }
    }

    private static void validateInputRange(int amount) {
        if (amount < 100) {
            throw new IllegalArgumentException("금액은 100원 이상으로만 입력 가능합니다.");
        } else if (amount > 500000) {
            throw new IllegalArgumentException("금액은 50만원 이하로만 입력 가능합니다.");
        }
    }

    private static void validateInputFormat(int amount) {
        if (amount % 10 != 0) {
            throw new IllegalArgumentException("금액은 10원으로 나누어 떨어져야 합니다.");
        }
    }
}
