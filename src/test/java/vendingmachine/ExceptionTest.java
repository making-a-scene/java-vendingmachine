package vendingmachine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import vendingmachine.ui.InputValidator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ExceptionTest {

    @DisplayName("자판기 보유 금액에 대한 예외 처리")
    @ValueSource(strings = {"정수 아님", "50", "600000", "1234"})
    @ParameterizedTest
    void validateRetainingAmountTest(String input) {
        assertThatThrownBy(() -> InputValidator.validateRetainingAmount(input))
                .isInstanceOf(IllegalArgumentException.class);
    }


}
