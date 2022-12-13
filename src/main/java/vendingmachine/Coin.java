package vendingmachine;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    public static Coin getCoin(int amount) {
        Coin[] coins = Coin.values();
        for (Coin coin : coins) {
            if (coin.amount == amount) {
                return coin;
            }
        }
        throw new IllegalArgumentException("Invalid amount");
    }

    // 추가 기능 구현
}
