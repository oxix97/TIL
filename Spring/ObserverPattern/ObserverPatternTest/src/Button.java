import observer.IButtonListener;

public class Button {
    private String name;
    private IButtonListener listener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String msg) {
        listener.clickListener(msg);
    }

    public void addListener(IButtonListener listener) {
        this.listener = listener;
    }
}
