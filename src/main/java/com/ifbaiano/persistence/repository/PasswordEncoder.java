package com.ifbaiano.persistence.repository;

public interface PasswordEncoder {
    
    String encode(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
