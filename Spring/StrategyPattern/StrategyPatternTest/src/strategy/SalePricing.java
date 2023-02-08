package strategy;

public class SalePricing implements PricingStrategy {
    @Override
    public double getPrice(double originalPrice) {
        return originalPrice * 0.75;
    }
}
