package com.example.demo.restservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingControllerTest {

    @Autowired
    private GreetingController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    void testGreeting() {

        var greeting = controller.greeting("bar");

        var expected = new Greeting(1, "Hello, bar!");
        assertEquals(expected, greeting);
    }

}
