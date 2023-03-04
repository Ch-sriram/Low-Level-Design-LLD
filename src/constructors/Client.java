package constructors;

public class Client {

    /*
     * Instead of Copy Constructor, we can try and use a util function for copying the same
     * type instance and returning a new instance.
     *
     * But that method won't be able to copy private members of the instance passed to the method.
     *
     * NOTE: Instead of using a `copyObject`, we can use copy constructor.
     * Also, we can define the same function inside the NewStudent class (which will enable access of private members as well),
     * but it's always better to use copy constr.
     * */
    static NewStudent copyObject(NewStudent newStudent) {
        String name = newStudent.name;
        int age = newStudent.age;
        String batchName = newStudent.batchName;
        // double psp = newStudent.psp; // `psp` can't be accessed since it's private
        return new NewStudent(name, age, batchName, 0.0); // Therefore, we're just filling in 0.0 for psp
    }

    public static void main(String[] args) {
        // constructor is invoked
        Student stu = new Student(); // default constructor is invoked
        System.out.println(stu.name + " is " + stu.age + " years old and his batch name is " + stu.batchName);

        NewStudent newStudent = new NewStudent("some-name", 20, "adv-dec-21", 80);
        System.out.println(newStudent.name + " is " + newStudent.age + " years old and they're from " + newStudent.batchName + " batch.");

        NewStudent nS = newStudent; // `nS` is a reference to `newStudent`. The actual values inside weren't copied.
        System.out.println(nS == newStudent); // true

        // Partially copy objects using the `copyObject` method above
        NewStudent newStudentPartialCopy = copyObject(newStudent);
        System.out.println(newStudentPartialCopy.name + " is " + newStudentPartialCopy.age + " years old and they're from " + newStudentPartialCopy.batchName + " batch.");

        // Copying the object `newStudent` using the copy constructor
        // `newStudent1` here has copied values from `newStudent` and creating a new object in memory. Therefore, `newStudent1` here is not a reference.
        NewStudent newStudent1 = new NewStudent(newStudent);
        System.out.println(newStudent1 == newStudent); // false
        System.out.println(newStudent1.name + " is " + newStudent1.age + " years old and they're from " + newStudent1.batchName + " batch.");


        NewStudent nS1 = new NewStudent(newStudent);
        nS1.mutableName = new StringBuffer("BalsamicVinegar");

        NewStudent nS2 = new NewStudent(nS1); // Creates a Shallow Copy, meaning: doesn't deeply copy any properties which are object type.
        nS2.mutableName.append("GingerAle"); // this also changes the mutable string at `nS1.mutableName` to "BalsamicVinegarGingerAle"
        System.out.println("nS1.mutableName: " + nS1.mutableName); // BalsamicVinegarGingerAle
        System.out.println("nS2.mutableName: " + nS2.mutableName); // BalsamicVinegarGingerAle
    }
}
