package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.batchName = "dec2021";
        instructor.averageRating = 9.3;
        instructor.userName = "Ram"; // `userName` is a property from User class.
        instructor.login(); // Ram logged in
    }
}
