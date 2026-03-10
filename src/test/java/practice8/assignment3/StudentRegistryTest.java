package practice8.assignment3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class StudentRegistryTest {
    private StudentRegistry registry;

    @BeforeEach
    void setUp() {
        registry = new StudentRegistry();
    }

    @Test
    public void testClearingAfterDeletion() {
        Student student = new Student("example@ukr.net", "htos", "id#1");
        registry.addStudent(student);

        registry.removeById("id#1");

        assertTrue(registry.findById(student.id()).isEmpty());
        assertTrue(!registry.containsEmail(student.email()));
    }


    @Test
    public void sameEmailAfterDeletion() {
        String email = "example@ukr.net";
        Student student = new Student(email, "htos", "id#1");
        registry.addStudent(student);

        registry.removeById("id#1");

        Student student2 = new Student(email, "ne htos", "id#12323");
        assertDoesNotThrow(() -> registry.addStudent(student2), "Student with email " + student.email() + " already exists");
    }

}
