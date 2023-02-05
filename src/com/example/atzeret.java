package com.example;

public class atzeret {
    public static int atz_rec(int i){
        if (i <= 1){
            return 1;
        }
      return atz_rec(i - 1) * i;
    }


   public static int atz(int i){
       if (i <= 1){
           return 1;
       }
       int b = 1;
       for (int e = 2; e <= i; e++){
        b *= e ;
       }
       return b;
   }

    public static void print_atz(){
        System.out.println(atz(10));
    }
}

