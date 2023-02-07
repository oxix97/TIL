import observer.IButtonListener;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("button");

        button.addListener(new IButtonListener() {
            @Override
            public void clickListener(String event) {
                System.out.println(event);
            }
        });

        button.click("click 1");
        button.click("click 2");
        button.click("click 3");
        button.click("click 4");

    }

}