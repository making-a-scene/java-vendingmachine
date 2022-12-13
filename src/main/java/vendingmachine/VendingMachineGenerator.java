package vendingmachine;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInList;
import static vendingmachine.Coin.*;

public class VendingMachineGenerator {

    private VendingMachine vendingMachine;

    public VendingMachineGenerator() {
        vendingMachine = new VendingMachine();
    }

    public void setCoinsInVendingMachine(int retainingAmount) {
        int rest = retainingAmount;
        while (rest >= 10) {
            int pickedCoin = getRandomAmount(rest);
            rest -= pickedCoin;
            vendingMachine.setNumberOfCoins(pickedCoin);
        }
    }

    private static int getRandomAmount(int rest) {
        List<Integer> kindOfCoins = Arrays.asList(
                COIN_500.getAmount(), COIN_100.getAmount(), COIN_50.getAmount(), COIN_10.getAmount()
        );
        int picked;
        do {
            picked = pickNumberInList(kindOfCoins);
        } while (picked > rest);
        return picked;
    }


}
