package constructorchaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();
    /*
        The constructors calls are chained, i.e., To create an object of D, object of C has to be created, as D extends C.
        In the same way, to create an object of C, object of B has to be created, since C extends B.
        And so on... so forth...

        And we already know that when an object is created, it's created via the constructor of the class of which the instance is being created for.

    Output:
        Constructor of A has been called.
        Constructor of B has been called.
        Constructor of C has been called.
        Constructor of D has been called.
    */
    }
}
