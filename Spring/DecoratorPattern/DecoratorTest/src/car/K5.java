package car;

import decorator.ICar;
import decorator.KIADecorator;

public class K5 extends KIADecorator {

    public K5(ICar kia, String name) {
        super(kia, name, 2500);
    }
}

