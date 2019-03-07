package com.rabbitmq.rabbitmqdemo;

import java.io.Serializable;

public class TestObjectMessage implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String message;

    public TestObjectMessage (String id, String message) {
        this.id = id;
        this.message = message;
    }
}