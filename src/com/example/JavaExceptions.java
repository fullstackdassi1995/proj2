package com.example;

import java.util.Scanner;


public class JavaExceptions {
    //מצגת 29 עמוד 21-22
    public static int job(String jobTitle){
        if (!jobTitle.equals("Fullstack") && !jobTitle.equals("Backend") && !jobTitle.equals("Frontend")){
            throw new IllegalArgumentException("The provided job title is unsupported");
        }else if (jobTitle.equals("Fullstack")) {
            return 22000;
        }else if (jobTitle.equals("Backend")){
            return 20000;
        }else {return 18000;
        }
    }

    public static void sumWork(){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String jobTitle = s.next();
        try {
            int more_5_y = job(jobTitle)+2000;
             System.out.format("Hello %s, with the job title %s you will earn in 5 years: %d shekels", name, jobTitle, more_5_y);
        }
        catch (IllegalArgumentException e){
            System.out.format("Hello %s, the job title you provide %s is unknown to us, so we can t calculate your salary in 5 years", name, jobTitle);
           e.printStackTrace();
        }
    }
}
