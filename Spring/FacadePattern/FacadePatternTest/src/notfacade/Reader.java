package notfacade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Reader %s connect", fileName);
        System.out.println(msg);
    }

    public void fileRead() {
        String msg = String.format("Reader %s read", fileName);
    }

    public void fileDisconnect() {
        System.out.println("fileReader disconnected");
    }
}

