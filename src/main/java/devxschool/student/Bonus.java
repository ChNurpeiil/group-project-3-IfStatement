package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        /**
         *
         * A company decided to give a bonus
         * of 3% if his/her year of service
         * is more than 3 years inclusively and
         * 5% to employee if his/her year
         * of service is more than 5 years exclusively.
         * Ask user for their salary and year of service and
         * print the net bonus amount.
         *
         * example output:
         * Enter you salary:
         * 100000
         * Enter years of service:
         * 3
         * Your bonus is 3000.0
         */
        Scanner input = new Scanner(System.in);
        int salary = 0;
        int yearOfService = 0;
        double bonus = 0;

        //TODO implement your code here...
        System.out.println("What is your yearly salary");
        salary = input.nextInt();
        System.out.println("How many year have you been working at company x?");
        yearOfService = input.nextInt();


        if (yearOfService <= 3){
            bonus = salary*0.03;
            System.out.println("Your bonus is " + bonus);
        }
        else if (yearOfService <= 5){
            bonus = salary*0.05;
            System.out.println("Your  not bonus is " + bonus);
        } else
            System.out.println(bonus);


        //ignore this
        Validation.testBonus(salary, yearOfService, bonus);
    }
}
