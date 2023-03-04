package constructors;

public class NewStudent {
    public String name;
    protected int age;
    String batchName;
    private double psp;

    public StringBuffer mutableName;

    // Parameterized Constructor
    public NewStudent(String name, int age, String batchName, double psp) {
        this.name = name;
        this.age = age;
        this.batchName = batchName;
        this.psp = psp;
    }

    // Copy Constructor
    // Nested Objects won't be copied deeply, only their reference is copied (shallow-copy).
    public NewStudent(NewStudent newStudent) {
        this.name = newStudent.name;
        this.age = newStudent.age;
        this.batchName = newStudent.batchName;
        this.psp = newStudent.psp;
        this.mutableName = newStudent.mutableName;
    }
}
