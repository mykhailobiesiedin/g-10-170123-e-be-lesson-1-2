package com.example.g10170123ebelesson12;

import org.springframework.stereotype.Component;

//@Component
public class ClassB {
    private String message;

    public ClassB(String message) {
        this.message = message;
    }
//    public ClassB(){
//
//    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
