package com.example.springlib.model;

public class Event {
    private String type;
    private String payload;

    public Event() {
    }

    public Event(String type, String payload) {
        this.type = type;
        this.payload = payload;
    }

    public String getType() { return type; }
    public String getPayload() { return payload; }
}