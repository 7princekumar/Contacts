package com.princekumar;

import java.util.ArrayList;

/**
 * Created by princekumar on 06/08/17.
 */
public class MobilePhone {
    private String myNumber; //Actual SIM Card Number
    private ArrayList<Contact> myContacts; //List of contacts saved on that phone.



    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public void addContact(String name, String phoneNumber){
        if(searchContact(name) >= 0){
            System.out.println("Contact already exists. Try modifying the contact.");
        }else{
            this.myContacts.add(Contact.createContact(name,phoneNumber));
        }
    }



    public void modifyContact(String name, Contact newContact){
        if(searchContact(name) >= 0){
            this.myContacts.set(searchContact(name), newContact);
        }else{
            System.out.println("Contact doesn't exist. Cannot Modify.");
        }
    }



    public void removeContact(String name){
        if(searchContact(name) >= 0){
            this.myContacts.remove(searchContact(name));
        }else{
            System.out.println("Contact doesn't exist. Cannot delete.");
        }
    }



    private int searchContact(String name){
        for(int i = 0; i< this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) { //NOTE '==' didn't work here
                return i;
            }
        }
        return -1;
    }



    public void showContact(String name){
        if(searchContact(name) >= 0){
            System.out.println("Name : " +name);
            System.out.println("Number: " +this.myContacts.get(searchContact(name)).getPhoneNumber());
        }else{
            System.out.println("Contact doesn't exist. Nothing to show.");
        }
    }



    public void printContacts(){
        System.out.println("\nContacts:");
        for(int i = 0; i<this.myContacts.size(); i++){
            System.out.println(i+ ". " +this.myContacts.get(i).getName() +
                                  " : "+this.myContacts.get(i).getPhoneNumber());
        }
    }

}
