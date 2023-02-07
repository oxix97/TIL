import facade.SftpClient;
import notfacade.FTP;
import notfacade.Reader;
import notfacade.Writer;

public class Main {
    public static void main(String[] args) {
        FTP client = new FTP("www.naver.com", 22, "/home/etc");
        SftpClient facade = new SftpClient(client, "text.tmp");

        facade.connect();
        facade.write();
        facade.read();
        facade.disConnect();
    }
}