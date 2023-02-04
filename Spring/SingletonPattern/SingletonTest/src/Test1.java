import singleton.SocketClient;

public class Test1 {
    private SocketClient sc;

    public Test1() {
        this.sc = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.sc;
    }
}
