package com.ifbaiano.domain.usecase;

import com.ifbaiano.domain.model.User;

public interface AuthenticateUserUseCase {
    User authenticate(String email, String password);
    void blockAccount(String email);
    boolean checkEmail(String email);
}