package com.multithreading.www;

import java.util.Scanner;

class Threaduy extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}

class Threadhs extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Threadhs: " + i);
        }
    }
}

public class Lab5Multithreading {
    public static void main(String args[]) {
        int x, y;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter first number: ");
        x = ob.nextInt();
        System.out.print("Enter second number: ");
        y = ob.nextInt();

        Threaduy one = new Threaduy();
        Threadhs two = new Threadhs();

        one.start();
        two.start();
        ob.close();
    }
}
