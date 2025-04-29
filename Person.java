/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alect
 */
public class Person {
    private String name;
    private String email;
    private String phoneNumber; //A phone number is too large for an int. Make it a string
    
    public Person(String name, String email, String phoneNumbers) {
        this.name=name;
        this.email=email;
        this.phoneNumber = phoneNumber;
    }
    
    public void displayInfo() {
        System.out.println("Name " + name);
        System.out.println("Email " + email);
        System.out.println("Phone # " + phoneNumber);
    }
    
}
