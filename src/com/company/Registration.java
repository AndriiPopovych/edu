package com.company;

import java.util.Scanner;

import static com.company.Serialization.serialize;

public class Registration {

    public static String newUser() {
        User user = new User();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name");
        user.setUsername(scan.nextLine());
        System.out.println("Enter password");
        user.setPassword(scan.nextLine());
        System.out.println("Confirm password");
        user.setConfirmPassword(scan.nextLine());

        if (user.getPassword().equals(user.getConfirmPassword())) {
            System.out.println("you are registered " + user.getUsername());
            return serialize(user);
        } else {
            System.out.println("retard");
        }
        return null;
    }
}

