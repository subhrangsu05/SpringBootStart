package com.springboottutorial.springbootapp;

public class UserData {
    private String email,password,address,address2,city,state;
    private int zip;
    public UserData(String email,String password,String address,String address2,String city,String state,int zip){
        this.email = email;
        this.password = password;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String toString(){
        return "Email:"+email+", password:"+password+", address:"+address+", address2"+address2+", city:"+city+", state:"+state+", zip:"+zip;
    }
}
