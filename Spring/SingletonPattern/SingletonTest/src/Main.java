public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        System.out.println(t1.getSocketClient() == t2.getSocketClient());
    }
}