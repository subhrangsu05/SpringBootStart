package com.springboottutorial.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class Food {
    public String takeYourFood(){
        return "Hi sir, would you like this food!";
    }
}
