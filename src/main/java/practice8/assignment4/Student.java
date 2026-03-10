package practice8.assignment4;

import java.util.Objects;

public class Student {
    public String email;
    public String name;
    public String id;

    public Student(String email, String name, String id) {
        this.email = email;
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null ||getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return Objects.equals(id, student.id) && Objects.equals(email, student.email);
    }

    @Override
    public String toString() {
        return "Student{id:'" + id + "', name:'" + name +  "', email:'" + email + "'}";
    }
}
