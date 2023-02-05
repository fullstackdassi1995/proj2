package com.example;
import java.util.Arrays;
import java.util.Random;
public class BreakAndContinue {
    public static void iLike(String[] arr){
        //I understood that you need to change random places:
        Random rand = new Random();

        for (int e = 0; e < arr.length; e++){
            int myRand = rand.nextInt(5);
            String rand_index = arr[myRand];
            arr[myRand] = arr[e];
            arr[e] = rand_index;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void print_arr(){
        String[] iUse= {"Computer", "refrigerator", "phone", "washing machine", "microwave"};
        String[] iLove = {"Belgian waffle", "pizza", "cucumber", "chocolate", "baguette"};
        iLike(iUse);
        iLike(iLove);

        for (String l: iUse)   {
            if (l == "phone"){
                System.out.println("The iteration was stop because i chose this word");
                break;
            }
            System.out.println(l);
        }
    }

}
