package com.example.springbasic.liftcycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {
    @Test
    public void lifeCycleTest() {
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        MockNetworkClient client = ac.getBean(MockNetworkClient.class);
        ac.close();

    }

    @Configuration
    static class LifeCycleConfig {

        @Bean
        public MockNetworkClient networkClient() {
            MockNetworkClient client = new MockNetworkClient();
            client.setUrl("http://hello-spring.dev");
            return client;
        }
    }
}
