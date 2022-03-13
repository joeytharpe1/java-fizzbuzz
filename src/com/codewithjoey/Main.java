package com.codewithjoey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// fizzbuzz in java
        /* if a number is divisible by 5 and 3 print out fizzbuzz,
            if a number is divisible by 5 print out fizz
            if a number is divisible by 3 print out buzz
            and finally if a number is not any of those case just print out the number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if(number % 15 == 0){
            System.out.println("FizzBuzz");
        } else if(number % 5 == 0){
            System.out.println("Fizz");
        } else if(number % 3 == 0){
            System.out.println("Buzz");
        } else{
            System.out.println(number);
        }
    }
}
