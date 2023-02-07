import car.K3;
import car.K5;
import car.K7;
import decorator.KIA;
import decorator.ICar;

public class Main {
    public static void main(String[] args) {
        ICar kia = new KIA(1000);
        kia.showPrice();

        ICar[] kiaCars = {new K3(kia, "K3"), new K5(kia, "K5"), new K7(kia, "K7")};

        for (ICar car : kiaCars) {
            car.showPrice();
        }
    }
}