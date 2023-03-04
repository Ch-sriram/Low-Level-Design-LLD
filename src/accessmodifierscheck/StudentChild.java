package accessmodifierscheck;

import accessmodifiers.Student;

public class StudentChild extends Student {
    public void doSomething() {
        // public members can be accessed anywhere
        this.name = "Child";

        // protected member can be accessed by a class in another package iff, that class is a child class of where the protected member is
        this.age = 39;

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

//        System.out.println("BatchName: " + this.batchName); // default member cannot be accessed by any method/class/member in another package
//        System.out.println("PSP: " + this.psp); // private member cannot be accessed by any other class
    }
}
