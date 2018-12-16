package io.datus.odapt.services;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest("config.connection=FooBar")
public class MyConnectionAutowireTest {

    @Autowired
    private ConfigConsumer consumer;

    @Test
    public void contextLoads() {
        assertThat(consumer.connection()).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {
    }

}