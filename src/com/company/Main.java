package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        // BufferedReader inpit = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter CHECK to check a raffle ticket or enter PURCHASE to purchase a raffle ticket");
        // write your code here
    }

    public static int checkNumber() {
        int raffleNumber = -1;
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("please enter your raffle number");
            raffleNumber = Integer.parseInt(input.readLine());

        } catch (Exception e) {
        }
        return raffleNumber;

    }

    public static boolean prizeCheck(int raffleNumber) {

        boolean prize = false;
        if (raffleNumber % 2 == 0) {
            prize = true;
            System.out.println("you have won a speed boat. WARNING SPEED BOAT MAY NOT BE REAL AND MAY REQUIRE IMAGINATION TO USE");
        } else {
            prize = false;
            System.out.println("you didn't win a prize how unfortunate");
        }
        return prize;
    }
}
