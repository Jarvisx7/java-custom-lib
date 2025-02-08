package com.example.springlib.configuration;

import com.example.springlib.model.Event;
import com.example.springlib.service.EventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class EventHandlerAutoConfiguration {
    @Bean
    public EventHandler eventHandler(KafkaTemplate<String, Event> kafkaTemplate) {
        return new EventHandler(kafkaTemplate);
    }
}
