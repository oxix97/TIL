package car;

import decorator.ICar;
import decorator.KIADecorator;

public class K7 extends KIADecorator {

    public K7(ICar kia, String name) {
        super(kia, name, 4000);
    }
}
