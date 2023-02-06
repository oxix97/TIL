import proxy.Browser;
import proxy.BrowserInterface;
import proxy.BrowserProxy;

public class Main {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
        BrowserInterface proxy = new BrowserProxy("www.naver.com");
        proxy.show();
        proxy.show();
        proxy.show();
        proxy.show();
    }
}