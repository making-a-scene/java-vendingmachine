package vendingmachine.ui;

import static vendingmachine.ui.ReservedMessage.*;

public class OutputView {

    public static void printErrorMsg(Exception e) {
        System.out.println(Error + e.getMessage());
    }
    public static void printMsgForGetRetainingAmount() {
        System.out.println(GET_RETAINING_AMOUNT.getMsg());
    }
}
