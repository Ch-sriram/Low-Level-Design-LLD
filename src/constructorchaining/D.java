package constructorchaining;

public class D extends C {
    D() {
        super("Hello");
        System.out.println("Constructor of D has been called.");
    }
}
