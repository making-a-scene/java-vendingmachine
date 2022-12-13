package vendingmachine.ui;

public enum ReservedMessage {
    GET_RETAINING_AMOUNT("자판기가 보유하고 있는 금액을 입력해 주세요."),
    Error("[ERROR] ");

    private final String msg;

    ReservedMessage(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
