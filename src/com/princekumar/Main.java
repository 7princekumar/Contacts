//Implement a simple mobile phone
package com.princekumar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone sonyZ3 = new MobilePhone("7795308818");

    public static void main(String[] args) {
        startPhone();

	    boolean quit = false;
        printMenu();
	    while(!quit){
            System.out.println("Choice (7 for options): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //TO CLEAR THE BUFFER

            switch (choice){
                case 1: shutDownPhone();
                        quit = true;
                        break;
                case 2: sonyZ3.printContacts();
                        break;
                case 3: addNewContact();
                        break;
                case 4: updateContact();
                        break;
                case 5: removeContact();
                        break;
                case 6: showContact();
                        break;
                case 7: printMenu();
                        break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        }
    }

    public static void printMenu(){
        System.out.println("Press");
        System.out.println("\t 1. Quit");
        System.out.println("\t 2. Print List of Contacts");
        System.out.println("\t 3. Add New Contact");
        System.out.println("\t 4. Update existing Contact");
        System.out.println("\t 5. Remove Contact");
        System.out.println("\t 6. Search/find Contact");
        System.out.println("\t 7. Print lists of actions.");
    }

    public static void startPhone(){
        System.out.println("Starting phone...");
    }

    public static void shutDownPhone(){
        System.out.println("Shutting down phone...");
    }

    public static void addNewContact(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        sonyZ3.addContact(name,phoneNumber);
    }

    public static void updateContact(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        sonyZ3.modifyContact(name, Contact.createContact(name, phoneNumber));
    }

    public static void removeContact(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        sonyZ3.removeContact(name);
    }

    public static void showContact(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        sonyZ3.showContact(name);
    }
}
