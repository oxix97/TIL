import strategy.*;

public class Main {
    public static void main(String[] args) {
        PricingStrategy regularPricing = new RegularPricing();
        PricingStrategy disCountPricing = new DiscountPricing();
        PricingStrategy salePricing = new SalePricing();

        Item regularItem = new Item("notebook", 2999, regularPricing);
        Item disCountItem = new Item("notebook", 2999, disCountPricing);
        Item saleItem = new Item("notebook", 2999, salePricing);

        System.out.println("notebook price : $" + regularItem.getPrice());
        System.out.println("notebook price : $" + disCountItem.getPrice());
        System.out.println("notebook price : $" + saleItem.getPrice());
    }
}

