package laptops;

public class Acer {
    private final StandardKeyboard keyboard;
    private final StandardMouse mouse;

    public Acer() {
        this.keyboard = new StandardKeyboard();
        this.mouse = new StandardMouse();
    }

    public StandardKeyboard getKeyboard() {
        return keyboard;
    }

    public StandardMouse getMouse() {
        return mouse;
    }
}
