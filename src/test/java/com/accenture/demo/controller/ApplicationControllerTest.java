package com.accenture.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationControllerTest {

    ApplicationController applicationController = new ApplicationController();
    @Test
    void getActualFeed() {
        assertEquals("feed",applicationController.getActualFeed());
    }
}