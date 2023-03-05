package memorymodel;

public class Client {
    static void doSomething(Student st) {
        st.name = "XYZ";
        st = new Student();
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "ABC";
        st.age = 60;
        doSomething(st); // Changes st.name from "ABC" to "XYZ"
        System.out.println("Student's name: " + st.name); // XYZ
    }
}
