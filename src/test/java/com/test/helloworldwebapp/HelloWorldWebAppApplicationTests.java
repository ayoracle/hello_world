package com.test.helloworldwebapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeControllerTest {

    private final HomeController controller = new HomeController();

    @Test
    void helloReturnsHelloWorld() {
        assertEquals("Hello World", controller.hello());
    }
}