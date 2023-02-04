import singleton.SocketClient;

public class Test2 {
    private SocketClient sc;

    public Test2() {
        this.sc = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.sc;
    }
}

