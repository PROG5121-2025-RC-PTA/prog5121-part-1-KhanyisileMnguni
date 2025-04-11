/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaloginandregistration_assignmentpart1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class JavaLoginandRegistration_assignmentpart1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      
        String registeredUsername = "";
        String registeredPassword = "";
        String registeredPhone = "";

        System.out.println("Welcome to the Registration Page"); 
      
             // Registration
             //Username
             System.out.println("Register a username (must contain '_' and be max 5 characters): ");
             registeredUsername = scanner.nextLine();
             if (!(registeredUsername.contains("_") && registeredUsername.length()<= 5)) {
                 System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is not more than five characters in length");
                 return;
             } else {
                 System.out.println("True"); //Username formatted
             }

             //Password
             System.out.print("Register a password (max 8 characters, 1 special character, 1 captial letter and 1 number): ");
             registeredPassword = scanner.nextLine();
             if (registeredPassword.length()<= 8) {
                 System.out.println("Password is not correctly formatted, please ensure that the password contains eight characters, a capital letter, a number, and a special character");
                 return;
             } else {
                 System.out.println("Password successfully captured");
             }
             
             //Phone number
             System.out.print("Register a phone number (must start with +27): ");
             registeredPhone = scanner.nextLine();
             if (!registeredPhone.startsWith("+27")) {
                 System.out.println("Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again");
                 return;
             } else {
                 System.out.println("Cell number successfully captured.");
             }
             
             System.out.print("\nRegistration successful!");
             System.out.println("Please log in to continue");

               // Login
                boolean isLoggedIn = false;
        
                System.out.print("\nEnter username: "); {
                String username = scanner.nextLine();
            
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                
                System.out.print("Enter phone number: ");
                String phone = scanner.nextLine();
            
                if (username.equals(registeredUsername) && password.equals(registeredPassword) && phone.equals(registeredPhone)) {
                    System.out.println("Login successful! Welcome " + username + ",it is great to see you!");
                    isLoggedIn = true;
                } else {
                   System.out.println("Incorrect username, password or phone number,please try again");
            }   
        }

        scanner.close();    
    }
    }