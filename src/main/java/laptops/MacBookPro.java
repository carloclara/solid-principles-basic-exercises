package laptops;

public class MacBookPro {
    private final MagicKeyboard keyboard;
    private final MagicMouse mouse;

    public MacBookPro() {
        this.keyboard = new MagicKeyboard();
        this.mouse = new MagicMouse();
    }

    public MagicKeyboard getKeyboard() {
        return keyboard;
    }

    public MagicMouse getMouse() {
        return mouse;
    }
}
