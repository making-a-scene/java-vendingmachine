package vendingmachine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vendingmachine.ui.InputView;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class UnitTest {

    private static InputStream setInputStream(byte [] input) {
        return new ByteArrayInputStream(input);
    }

    @DisplayName("유효한 보유 금액이 입력될 경우에는 입력 값을 int 타입으로 변환해 반환합니다.")
    @Test
    void setVendingMachineRetainingAmountTest() {
        System.setIn(setInputStream("3500".getBytes()));
        int actualAmount = InputView.getRetainingAmount();
        Assertions.assertThat(actualAmount).isEqualTo(3500);
    }
}
