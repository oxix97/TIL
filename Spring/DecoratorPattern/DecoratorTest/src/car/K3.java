package car;

import decorator.ICar;
import decorator.KIA;
import decorator.KIADecorator;

public class K3 extends KIADecorator {
    public K3(ICar kia, String name) {
        super(kia, name,1000);
    }
}
