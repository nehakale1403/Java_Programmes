package com.nehak;

import java.util.Scanner;

public class java_06_calculating_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Max marks of 1 subject:");
        float outof = sc.nextInt();
        System.out.println("Enter marks of 5 subjects:");
        float s1 = sc.nextInt();
        float s2 = sc.nextInt();
        float s3 = sc.nextInt();
        float s4 = sc.nextInt();
        float s5 = sc.nextInt();

        System.out.println(s1 + s2 + s3 + s4 + s5);
        float sum = s1+s2+s3+s4+s5;
        float div = outof*5;
        System.out.println(div);
        float percent = sum*100/div;
        System.out.println(percent+"%");
    }
}
