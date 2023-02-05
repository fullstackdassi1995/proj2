package com.example;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JavaExceptions.sumWork();
    }
//תרגילים ידניים שאיתי נתן, לא במצגות (שיעור 30/1/2023)

    public static void capital(){
        Scanner s = new Scanner(System.in);
        String name = s.next();

        if (name.equals(name.toUpperCase())) {
            System.out.println("CAPITAL");
        }
        else if (name.equals(name.toLowerCase())) {
            System.out.println("LOWER");
        }
    }

    public static String biggerString(String a , String b) {
        if (a.length() > b.length()){
            return a;
        }
        if  (a.length() == b.length()){
            return "the strings are equal";
        }
        return  b;
    }

    public static void arr1(){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int[] arr2 = new int[10] ;
    for (int i = 0; i < 10 ; i++ ){
        arr2[i] = (int)(Math.random()*49)+1;
    }
        System.out.println(Arrays.toString(arr2));
        for (int e:arr2
             ) {
           if (num == e ){
               System.out.println("true");
           }
           else {
               System.out.println("false");
           }
        }
    }

    public  static void twoArray( int[] arr1 ,  int[] arr2){
        int sum1 = 0;
        int sum2 = 0;
        for (int e : arr1) {
            sum1 += e;
        }
        for (int e : arr1) {
            sum2 += e;
        }
        if (sum1 > sum2){
            System.out.println(sum1);
        }
        else if (sum1 == sum2){
            System.out.println("the arrays are equal");
        }
        else {
            System.out.println(sum2);
        }

    }

}

