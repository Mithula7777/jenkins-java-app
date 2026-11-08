package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void homePageShouldReturnMessage() {
        String response = restTemplate.getForObject(
                "http://localhost:" + port + "/", String.class);
        assertEquals("Hello! Jenkins CI/CD with Docker is Working!", response);
    }

    @Test
    void healthShouldReturnHealthy() {
        String response = restTemplate.getForObject(
                "http://localhost:" + port + "/health", String.class);
        assertEquals("Application is Healthy!", response);
    }
}
