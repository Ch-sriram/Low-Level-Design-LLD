package accessmodifierscheck;

import accessmodifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student Name: " + student.name);
//        System.out.println("Student Age: " + student.age); // Cannot access protected variable in a different package
//        System.out.println("Student Batch Name: " + student.batchName); // Cannot access default member in a different package
//        student.psp; // Cannot access private variables here

        StudentChild studentChild = new StudentChild();
        studentChild.doSomething();
    }
}
