package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class Reply {

    private String message;


    public Reply(String message) {
        this.message = message;

    }

    public Reply() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
