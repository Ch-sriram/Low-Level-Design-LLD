package accessmodifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Batch Name: " + student.batchName);
//        student.psp; // Cannot access private variables here
    }
}
