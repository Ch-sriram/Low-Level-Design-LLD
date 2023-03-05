package constructorchaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();
        // class C's constructor expects a String argument, but D's constructor doesn't send in anything
        // To rectify this, D's constructor has to call C's constructor with parameter using `super()`
    /*
    Output:
        Constructor of A has been called.
        Constructor of B has been called.
        Constructor of C has been called with Hello
        Constructor of D has been called.
    */
    }
}
