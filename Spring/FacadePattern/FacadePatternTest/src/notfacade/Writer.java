package notfacade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Writer %s connect", fileName);
        System.out.println(msg);
    }

    public void write() {
        String msg = String.format("writer %s write", fileName);
    }

    public void fileDisconnect() {
        System.out.println("writer disconnected");
    }
}
