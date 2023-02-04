package adapter;

public class Type8toTypeCAdapter implements TypeC {

    private Type8 type8;

    public Type8toTypeCAdapter(Type8 type8) {
        this.type8 = type8;
    }

    @Override
    public void connect() {
        type8.connect();
    }
}
