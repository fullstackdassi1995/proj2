package com.example;

import java.util.Arrays;
import java.util.Random;

public class JavaLoops {
    //מצגת 27 עמוד 23
    public static void myFor() {

        Random rand = new Random();
        int[][] my_arr = {{5,8,3,545,78},{54,789,-45,45,1}};

      // int[][] my_arr = new int [5][5];
        for (int k = 0; k < my_arr[0].length; k++) {
            for (int e = 0; e < my_arr[1].length; e++) {
                //my_arr[k][e] = rand.nextInt(my_arr.length - 1) + 1;
                System.out.println(my_arr[k][e]);
            }
        }
    }
    public static void printArr(){
        int[][] my_arr = {{5,8,3,545,78},{54,789,-45,45,1}};
        for (int[] i: my_arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
