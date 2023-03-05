package constructorchaining;

public class Client {
    public static void main(String[] args) {
        D d = new D(); // class C's constructor is private, therefore D's instance cannot be created, as constructors are chained.
    /*
    Output:
        src\constructorchaining\D.java:4:9
java: C() has private access in constructorchaining.C
    */
    }
}
