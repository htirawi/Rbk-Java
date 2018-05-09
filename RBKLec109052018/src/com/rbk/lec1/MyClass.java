package com.rbk.lec1;

import java.util.Random;
import java.util.Scanner;

public class MyClass {

    public void printMsg(String param) {
        System.out.println(param);
    }

    public void guessMyNumber() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in


        System.out.println("Enter a number between 0 and 10: ");
        int i = 1;
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        Random rand = new Random();
        int num = (int) Math.floor(rand.nextInt(10) + 1);

        while (i < 7) {
            while (n < 0 || n > 10) {
                System.out.println("Please enter a number between 0 and 10: ");
                n = reader.nextInt();
            }
            if (n == num) {
                System.out.println("Congratulation!! You win!!");
            break;
            } else {
                if (i<3) {
                    i = i + 1;
                    System.out.println("try AGAIN:");
                    n = reader.nextInt();
                }else{
                    System.out.print("Game Over!! \nthe number is: ");
                    System.out.println(num);

                    break;
                }
            }


        }

        reader.close();
    }
}
