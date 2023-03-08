package org.lesson.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        //INPUT
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi scritti?");
        int num = Integer.parseInt(scan.nextLine());
        boolean check = true;

        //check value
        while (check) {
            if (num > 0 && num < 1000) {

                //OUTPUT
                for (int i = 1; i <= num; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                    check = false;
                }
        }else {
                System.out.print("Scrivi un numero compreso tra 0 e 1000: ");
                num = Integer.parseInt(scan.nextLine());
            }

}}}
