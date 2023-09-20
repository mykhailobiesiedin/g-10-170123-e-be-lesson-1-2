package com.example.g10170123ebelesson12;

import org.springframework.stereotype.Component;

//@Component
public class ClassA {
    private String message;

    public ClassA(String message) {
        this.message = message;
    }
//    public  ClassA(){
//
//    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
