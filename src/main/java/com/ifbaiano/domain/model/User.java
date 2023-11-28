package com.ifbaiano.domain.model;

import com.ifbaiano.domain.model.enums.UserType;

import jakarta.persistence.Entity;

@Entity
public class User extends Employee {
    
    private String email;
    private String password;
    private UserType user_type;

    public User(){

    }

    public User(String email, String password, UserType user_type) {
        this.email = email;
        this.password = password;
        this.user_type = user_type;
    }

    public User(int employeeId, String department, String email, String password, UserType user_type) {
        super(employeeId, department);
        this.email = email;
        this.password = password;
        this.user_type = user_type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUser_type() {
        return user_type;
    }

    public void setUser_type(UserType user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", password=" + password + ", user_type=" + user_type + "]";
    }

}
