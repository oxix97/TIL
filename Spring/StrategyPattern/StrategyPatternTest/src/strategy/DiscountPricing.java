package strategy;

public class DiscountPricing implements PricingStrategy {
    @Override
    public double getPrice(double originalPrice) {
        return originalPrice * 0.9;
    }
}
