package practice8.assignment3;

public class Main {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        String email = "jjjjjjj@gmail.com";
        Student first = new Student(email, "name", "id:1");
        Student second = new Student(email, "name 2", "id:2");

        studentRegistry.addStudent(first);
        try {
            studentRegistry.addStudent(second);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        studentRegistry.removeById(first.id());
        studentRegistry.addStudent(second);
        System.out.println(studentRegistry.findById(second.id()).get());
    }
}
