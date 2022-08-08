package Balance;

import java.util.UUID;

public class GiftCard extends Balance{

    public GiftCard(UUID customerID, Double balance) {
        super(customerID, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionAmount= additionalBalance*10/100;
        setBalance(getBalance()+additionalBalance+promotionAmount);
        return getBalance();
    }
}
