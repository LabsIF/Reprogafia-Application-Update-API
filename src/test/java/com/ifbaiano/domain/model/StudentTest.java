package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class StudentTest {
    
    @Test
    public void testConstructorWithParameters() {
        Student student = new Student(1, "Bachelor's in Information Systems", "Morning", "A101", "2021/1");

        assertEquals(1, student.getStudentId());
        assertEquals("Bachelor's in Information Systems", student.getCourse());
        assertEquals("Morning", student.getShift());
        assertEquals("A101", student.getClassGroup());
        assertEquals("2021/1", student.getEnrollmentSemester());

        // Verify inheritance from Person
        assertEquals(0, student.getPersonId());
        assertNull(student.getName());
        assertNull(student.getCpf());
        assertNull(student.getRegistration());
        assertNull(student.getPrints());
    }

    @Test
    public void testGettersAndSetters() {
        Student student = new Student();

        student.setStudentId(2);
        student.setCourse("Bachelor's in Information Systems");
        student.setShift("Afternoon");
        student.setClassGroup("B202");
        student.setEnrollmentSemester("2022/1");

        assertEquals(2, student.getStudentId());
        assertEquals("Bachelor's in Information Systems", student.getCourse());
        assertEquals("Afternoon", student.getShift());
        assertEquals("B202", student.getClassGroup());
        assertEquals("2022/1", student.getEnrollmentSemester());
    }

    @Test
    public void testToString() {
        Student student = new Student(3, "Medicine", "Night", "N301", "2020/2");

        String expectedToString = "Student [studentId=3, course=Medicine, shift=Night, classGroup=N301, enrollmentSemester=2020/2]";
        assertEquals(expectedToString, student.toString());
    }
}
