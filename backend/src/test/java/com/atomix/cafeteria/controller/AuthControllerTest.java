package com.atomix.cafeteria.controller;

import com.atomix.cafeteria.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@Import(TestConfig.class)
class AuthControllerTest {

    @Test
    void testApplicationContextLoads() {
        // This test ensures that the Spring application context loads successfully
    }
} 