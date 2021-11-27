
package motorcylce;

public class Motorcylce {
    private static String make;
    private static String color;
    private static boolean engineState;
    
    void startEngine() {
        if (engineState == true) {
            System.out.println("The engine is already on.");
        } else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
    
    void showAtts() {
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState == true) {
            System.out.println("The engine is on.");
        } else {
            System.out.println("The engine is off.");
        }
}
    public static void main(String[] args) {
        Motorcylce m = new Motorcylce();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("...........");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("...........");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("...........");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}