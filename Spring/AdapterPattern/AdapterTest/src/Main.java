import adapter.Type8;
import adapter.Type8toTypeCAdapter;
import adapter.TypeC;

public class Main {
    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        IPhone iPhone = new IPhone();

        typeC_connect(galaxy);
        type8_connect(iPhone);

        Type8toTypeCAdapter adapter = new Type8toTypeCAdapter(iPhone);
        typeC_connect(adapter);
    }

    static void typeC_connect(TypeC typeC) {
        typeC.connect();
    }

    static void type8_connect(Type8 type8) {
        type8.connect();
    }
}