package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class DayIdentifier {

    public static void main(String[] args) {
        /**
         *
         * Write a Java program that keeps a number from the user between 1 and 7 and displays the name of the weekday.
         *
         * example output:
         * Enter a number to get day of the week
         * 1
         * You selected Monday!
         *
         * another output:
         * Enter a number to get day of the week
         * 8
         * You selected Wrong Day!
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get day of the week ");
        int input = sc.nextInt();
        String day = "";

        //TODO implement your code here...


        Validation.testDayIdentifier(input, day);
    }
}
