package strategy;

public class RegularPricing implements PricingStrategy {
    @Override
    public double getPrice(double originalPrice) {
        return originalPrice;
    }
}
