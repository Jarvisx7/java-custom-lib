package com.example.springlib.service;

import com.example.springlib.model.Event;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventHandler {

    private final KafkaTemplate<String, Event> kafkaTemplate;

    public EventHandler(KafkaTemplate<String, Event> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void handleEvent(Event event) {
        kafkaTemplate.send("test-topic", event);
        System.out.println("Handling event of type: " + event.getType() + " with payload: " + event.getPayload());
    }
}

