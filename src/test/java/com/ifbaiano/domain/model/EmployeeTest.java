package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testConstructorWithParameters() {
        Employee employee = new Employee(1, "HR");

        assertEquals(1, employee.getEmployeeId());
        assertEquals("HR", employee.getDepartment());
        assertEquals(0, employee.getPersonId());
        assertNull(employee.getName());
        assertNull(employee.getCpf());
        assertNull(employee.getRegistration());
        assertNull(employee.getPrints());
    }

    @Test
    public void testGettersAndSetters() {
        Employee employee = new Employee();

        employee.setEmployeeId(2);
        employee.setDepartment("IT");

        assertEquals(2, employee.getEmployeeId());
        assertEquals("IT", employee.getDepartment());
    }

    @Test
    public void testToString() {
        Employee employee = new Employee(3, "Finance");

        String expectedToString = "Employee [employeeId=3, department=Finance]";
        assertEquals(expectedToString, employee.toString());
    }
}
