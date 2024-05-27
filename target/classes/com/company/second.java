package com.company;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        System.out.print("Вкажіть число: ");
        Scanner num = new Scanner(System.in);
        int num0 = num.nextInt();


        int num1 = num0 / 10;
        int num2 = num0 % 10;
        int number = num1 + num2;

        System.out.println(number);
    }
}