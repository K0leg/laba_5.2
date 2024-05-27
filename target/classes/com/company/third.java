package com.company;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        System.out.print("Число: ");
        Scanner num = new Scanner(System.in);
        double num1 = num.nextDouble();

        int num2 = (int) num1;
        double num3 = (10 * num1 - 10 * num2) / 10;
        double num4 = num3 + 0.5;
        int number = (int) num1 + (int) num4;

        System.out.println(number);

    }
}