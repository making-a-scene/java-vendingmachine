package vendingmachine;

import java.util.HashMap;
import java.util.Map;

import static vendingmachine.Coin.*;

public class VendingMachine {
    private final Map<Coin, Integer> numOfEachCoins = new HashMap<>();

    public void setNumberOfCoins(int unit) {
        Coin selectedCoin = getCoin(unit);
        numOfEachCoins.merge(selectedCoin, 1, Integer::sum);
    }
}
