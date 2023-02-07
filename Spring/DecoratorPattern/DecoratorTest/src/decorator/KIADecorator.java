package decorator;

public class KIADecorator implements ICar {
    protected ICar kia;
    protected String name;
    protected int price;

    public KIADecorator(ICar kia, String name, int price) {
        this.kia = kia;
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return kia.getPrice() + price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + "의 가격은 " + getPrice() + "만원 입니다.");
    }
}
