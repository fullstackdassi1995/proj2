package com.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class proj3 {
    public static void fruit(String s) {
        switch (s) {
            case "Mandarin":
                System.out.println(s);
                break;
            case "watermelon":
                System.out.println(s);
                break;
            case "mango":
                System.out.println(s);
                break;
            case "walnut":
                System.out.println(s);
                break;
            default:
                System.out.println("Sorry, can’t find a fruit with that name");
        }
    }
}
