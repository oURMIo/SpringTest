package com.example.restservice;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestServiceApplicationTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void work() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("don't work");
    }

    @Test
    public void work2() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/whois/lolo", String.class);
        assertThat(response.getBody()).isEqualTo("is the good!");
    }

    @Test
    public void work3() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/whois/dima", String.class);
        assertThat(response.getBody()).isEqualTo("THE BEST! AND I KNOW IT(❁´◡`❁)");
    }
}