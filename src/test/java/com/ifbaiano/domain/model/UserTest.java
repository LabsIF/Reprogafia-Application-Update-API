package com.ifbaiano.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import com.ifbaiano.domain.model.enums.UserType;

public class UserTest {

    @Test
    public void testConstructorWithParameters() {
        User user = new User("user@test.com", "password123", UserType.ADMIN);

        assertEquals("user@test.com", user.getEmail());
        assertEquals("password123", user.getPassword());
        assertEquals(UserType.ADMIN, user.getUser_type());

        // Check inheritance from Employee
        assertEquals(0, user.getEmployeeId());
        assertNull(user.getDepartment());

        // Check inheritance from Person
        assertEquals(0, user.getPersonId());
        assertNull(user.getName());
        assertNull(user.getCpf());
        assertNull(user.getRegistration());
        assertNull(user.getPrints());
    }

    @Test
    public void testGettersAndSetters() {
        User user = new User();

        user.setEmail("user2@test.com");
        user.setPassword("password456");
        user.setUser_type(UserType.NORMAL);

        assertEquals("user2@test.com", user.getEmail());
        assertEquals("password456", user.getPassword());
        assertEquals(UserType.NORMAL, user.getUser_type());
    }

    @Test
    public void testToString() {
        User user = new User(1, "IT", "editor@test.com", "password789", UserType.ADMIN);

        String expectedToString = "User [email=editor@test.com, password=password789, user_type=ADMIN]";
        assertEquals(expectedToString, user.toString());
    }

}
