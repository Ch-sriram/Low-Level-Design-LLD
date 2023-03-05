package constructorchaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();
        // class C's constructor expects a String argument, but D's constructor doesn't send in anything
        // To rectify this, D's constructor has to call C's constructor with parameter using `super()`
    /*
    Output: (Compilation Error)
        src\constructorchaining\D.java:4:9
        java: constructor C in class constructorchaining.C cannot be applied to given types;
          required: java.lang.String
          found: no arguments
          reason: actual and formal argument lists differ in length
    */
    }
}
