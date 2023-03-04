package constructors;

public class Student {
    public String name;
    protected int age;
    String batchName;
    private double psp;

    /*
    * There's a default constructor provided by JVM directly.
    * The default constructor has no parameters and is same as the no param constructor defined below:
    *
    * By default, all Objects are initialized to `null` and number type data is initialized to 0.
    *
    * Also, return type is implicit (which is the same class type).
    * And that's the reason why the object of this class, can only be held by the reference of this class.
    *
    * public Student() {
    *   this.name = null;
    *   this.age = 0;
    *   this.batchName = null;
    *   this.psp = 0.0;
    * }
    * */
}
