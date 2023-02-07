package facade;

class ComplexSystem {
    public void method1() {
        System.out.println("ComplexSystem: Method 1");
    }

    public void method2() {
        System.out.println("ComplexSystem: Method 2");
    }
}

class Facade {
    private ComplexSystem complexSystem;

    public Facade(ComplexSystem complexSystem) {
        this.complexSystem = complexSystem;
    }

    public void methodA() {
        System.out.println("Facade: Delegating Method A");
        complexSystem.method1();
    }

    public void methodB() {
        System.out.println("Facade: Delegating Method B");
        complexSystem.method2();
    }
}

public class Client {
    public static void main(String[] args) {
        ComplexSystem complexSystem = new ComplexSystem();
        Facade facade = new Facade(complexSystem);

        facade.methodA();
        facade.methodB();
    }
}

