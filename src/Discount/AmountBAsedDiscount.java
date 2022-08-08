package Discount;

import java.util.UUID;

public class AmountBAsedDiscount extends Discount{


    public AmountBAsedDiscount(UUID id, String name, Double thresholdAmount) {
        super(id, name, thresholdAmount);
    }

    @Override
    public Double CalculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }



}
