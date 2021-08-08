package com.accenture.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationControllerTest {


    AuthenticationController authenticationController = new AuthenticationController();
    @Test
    void getSignInPage() {
        assertEquals("login",authenticationController.getSignInPage());
    }

    @Test
    void redirectToLogin() {
        assertEquals("redirect:login",authenticationController.redirectToLogin());
    }

    @Test
    void getSignUpPage() {
        assertEquals("signup",authenticationController.getSignUpPage());
    }
}