package com.example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class JavaOperators {
    public static void fruit(String s) {
        switch (s) {
            case "Mandarin":
            case "watermelon":
            case "mango":
            case "walnut":
                System.out.println(s);
                break;
            default:
                System.out.println("Sorry, can’t find a fruit with that name");
        }
    }
}
