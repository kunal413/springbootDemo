package org.com.spring.springbootDemo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String HelloWorld(){
        return "Good day to you";
    }
}
