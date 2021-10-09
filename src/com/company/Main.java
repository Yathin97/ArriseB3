package com.company;

import java.util.Scanner;

import static sun.misc.Version.println;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age:\t");
        int age = scanner.nextInt();
        System.out.println(age);
        if (age > 18)
        {
            System.out.println("major");

        }
        else {
            System.out.println("minor");
        }

    }
}
