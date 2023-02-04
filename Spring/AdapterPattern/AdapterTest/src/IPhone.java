import adapter.Type8;

public class IPhone implements Type8 {
    @Override
    public void connect() {
        System.out.println("Type 8 연결됨");
    }
}
