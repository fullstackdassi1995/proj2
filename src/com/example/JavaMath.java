package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaMath {

    public static void random1() {
        int a = (int) (Math.random() * 4) + 1;
        int b = (int) (Math.random() * 4) + 1;
        if (a == b) {
            System.out.format("The numbers are equals with value: %d %d", a, b);
        } else {
            System.out.format("The numbers are not equals, first number value is:%d and second number value is: %d", a, b);
        }
    }

    public static void my_time(){
        LocalDateTime myTime = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String new_time = myTime.format(myFormat);
        System.out.println(new_time);
    }
}