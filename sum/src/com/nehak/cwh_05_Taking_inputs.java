package com.nehak;

import java.util.Scanner;

public class cwh_05_Taking_inputs {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = s.nextInt();
        System.out.println("Enter number2");
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The sum of 2 numbers is: " + sum);

        boolean b1 = s.hasNextInt(); //returns true if input is int, else false
        System.out.println(b1);

        String str = s.next(); //next() takes only one word......nextLine() takes the whole line
        System.out.println(str);

        


    }
}
