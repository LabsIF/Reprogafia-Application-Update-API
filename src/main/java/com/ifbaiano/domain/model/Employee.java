package com.ifbaiano.domain.model;

import jakarta.persistence.Entity;

@Entity
public class Employee extends Person {
    
    private int employeeId;
    private String department;

    public Employee(){

    }

    public Employee(int employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", department=" + department + "]";
    }
}
