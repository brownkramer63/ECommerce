package Discount;

import java.util.UUID;

public class RateBased extends Discount{
    private final Double rateAMount;

    public RateBased(UUID id, String name, Double thresholdAmount, Double rateAMount) {
        super(id, name, thresholdAmount);
        this.rateAMount=rateAMount;
    }

    @Override
    public Double CalculateCartAmountAfterDiscountApplied(Double amount) {
        return null;
    }
}
