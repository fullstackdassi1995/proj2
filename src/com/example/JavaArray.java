package com.example;

import java.util.Arrays;
import java.util.Random;

public class JavaArray {
    public static void arrays() {
        String[] arrS = {"a", "b", "c", "d", "e"};
        int[] arrI = {1, 2, 3, 4, 5};
        int n = arrS.length;


        Random rand = new Random();
        for (int i = 0; i < n ; i++){
            arrI[i] = rand.nextInt(n - 1) + 1;
        }
        System.out.println(Arrays.toString(arrI));


        String abcRand = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sd = new StringBuilder(n);
        int index = (int)(abcRand.length()*Math.random());
        sd.append(abcRand.charAt(index));
        arrS[2] = sd.toString();
        System.out.println(Arrays.toString(arrS));
    }

    public static void array2(){
        int[][] arrI = {{1,3,5,4,45}, {5,89,0,55,-45}};
        System.out.println(arrI[0][0]);
        System.out.println(arrI[1][0]);
    }
}
