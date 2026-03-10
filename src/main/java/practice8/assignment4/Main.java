package practice8.assignment4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student("jjjjjjj@gmail.com", "Alexdfas", "11");
        Student s2 = new Student("jjjjjjj@gmail.com", "Alexander", "22");

        students.add(s1);
        students.add(s2);

        System.out.println("Кількість студентів у сеті: " + students.size());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}