package vendingmachine.ui;

import camp.nextstep.edu.missionutils.Console;

import static vendingmachine.ui.InputValidator.*;
import static vendingmachine.ui.OutputView.*;

public class InputView {

    public static int getRetainingAmount() {
        String response = Console.readLine();
        try {
            return validateRetainingAmount(response);
        } catch (IllegalArgumentException e) {
            printErrorMsg(e);
            return getRetainingAmount();
        }
    }

}
