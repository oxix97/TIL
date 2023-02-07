package decorator;

public class KIA implements ICar {
    private int price;

    public KIA(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("KIA Car price : " + price);
    }
}
