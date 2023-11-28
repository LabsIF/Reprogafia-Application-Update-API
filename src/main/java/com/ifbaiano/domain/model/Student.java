package com.ifbaiano.domain.model;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person {
    
    private int studentId;
    private String course;
    private String shift;
    private String classGroup;
    private String enrollmentSemester;
    
    public Student(){

    }

    public Student(int studentId, String course, String shift, String classGroup, String enrollmentSemester) {
        this.studentId = studentId;
        this.course = course;
        this.shift = shift;
        this.classGroup = classGroup;
        this.enrollmentSemester = enrollmentSemester;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getClassGroup() {
        return classGroup;
    }

    public void setClassGroup(String classGroup) {
        this.classGroup = classGroup;
    }

    public String getEnrollmentSemester() {
        return enrollmentSemester;
    }

    public void setEnrollmentSemester(String enrollmentSemester) {
        this.enrollmentSemester = enrollmentSemester;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", course=" + course + ", shift=" + shift + ", classGroup=" + classGroup
                + ", enrollmentSemester=" + enrollmentSemester + "]";
    }

}
