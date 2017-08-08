package com.princekumar;

/**
 * Created by princekumar on 05/08/17.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    //constructor
    Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //since static, we can directly call this createContact with the Contact class, no need for any instance here.
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
