package laptops;

public class MyLaptops {

    public static void main(String[] args) {
        Acer acer = new Acer();
        System.out.println("Acer:");
        System.out.println(acer.getKeyboard().getNAME());
        System.out.println(acer.getMouse().getNAME());

        MacBookPro macBookPro = new MacBookPro();
        System.out.println("\nMacBookPro:");
        System.out.println(macBookPro.getKeyboard().getNAME());
        System.out.println(macBookPro.getMouse().getNAME());
    }

}
