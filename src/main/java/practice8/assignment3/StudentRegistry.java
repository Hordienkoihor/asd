package practice8.assignment3;

import java.util.*;

public class StudentRegistry {
    private final List<Student> list = new ArrayList<>();
    private final Set<String> set = new HashSet<>();
    private final Map<String, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        if (findById(student.id()).isPresent()) {
            throw new IllegalArgumentException("Student with id " + student.id() + " already exists");
        }

        if (containsEmail(student.email())) {
            throw new IllegalArgumentException("Student with email " + student.email() + " already exists");
        }

        list.add(student);
        set.add(student.email());
        map.put(student.id(), student);
    }

    public Optional<Student> findById(String id) {
        return Optional.ofNullable(map.get(id));
    }

    public boolean containsEmail(String email) {
        return set.contains(email);
    }

    public void removeById(String id) {
        Student found = map.remove(id);

        if (found != null) {
            list.removeIf(student -> student.id().equals(id));
            set.remove(found.email());
        }
    }
}
