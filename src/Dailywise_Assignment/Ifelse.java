package Dailywise_Assignment;

import java.util.Scanner;

public class Ifelse {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the username");
        String un=sc.next();
        System.out.println("Please enter the password");
        String pass=sc.next();
        if(un.equals("abc@gmai.com") && pass.equals("abc@123"))
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }


    }
}
