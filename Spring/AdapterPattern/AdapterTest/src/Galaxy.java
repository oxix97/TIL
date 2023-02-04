import adapter.TypeC;

public class Galaxy implements TypeC {

    @Override
    public void connect() {
        System.out.println("Type C 연결됨");
    }
}
