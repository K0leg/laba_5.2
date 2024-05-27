package com.company;

import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        System.out.print("Вкажіть перше число: ");
        Scanner num1 = new Scanner(System.in);
        int x = num1.nextInt();

        System.out.print("Вкажіть друге число: ");
        Scanner num2 = new Scanner(System.in);
        int y = num2.nextInt();



        System.out.println(x / y);
        System.out.println(x % y);
    }
}

