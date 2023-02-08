package strategy;

public class Item {
    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public Item(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public double getPrice() {
        return pricingStrategy.getPrice(price);
    }
}
