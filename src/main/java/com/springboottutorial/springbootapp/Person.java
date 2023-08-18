package com.springboottutorial.springbootapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
    @Autowired
    private Food food;
    public void talk(){
        System.out.println(food.takeYourFood());
    }
}
