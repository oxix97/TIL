package singleton;

public class SocketClient {
    private static SocketClient sc = null;

    private SocketClient() {
    }

    public static SocketClient getInstance() {
        if (sc == null) {
            sc = new SocketClient();
        }
        return sc;
    }
}
