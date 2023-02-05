package com.example;

import java.util.Arrays;

public class  JavaString {
    public static void myName() {
        String fullName = "david.goldberg";
        String[] piece = fullName.split("[.]");
        String first_name = piece[0];
        String last_name = piece[1];
        System.out.format("Welcome to the course: your first name is: %s and your last name is: %s \n", first_name, last_name);
        System.out.format("Welcome to the course: your last name is: %s", last_name);
        String result = String.format("Welcome to the course: your first name is: %s and your last name is: %s \n", first_name, last_name);
        if (result.indexOf(last_name) == -1){
        System.out.println("\nfalse");}
        else{  System.out.println("\ntrue");}

    }
}
