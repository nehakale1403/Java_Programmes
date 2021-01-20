package com.nehak;

import java.util.Scanner;

public class java_06_calculating_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Max marks of 1 subject:");
        int outof = sc.nextInt();
        System.out.println("Enter marks of 5 subjects:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        System.out.println(s1 + s2 + s3 + s4 + s5);
        int sum = s1+s2+s3+s4+s5;
        int div = outof*5;
        System.out.println(div);
        int percent = sum*100/div;
        System.out.println(percent+"%");
    }
}
