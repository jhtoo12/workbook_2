package com.pluralsight.fullname;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        System.out.println("1. What is your full name!");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        int positionOfSpace = fullName.indexOf(' ');
        String firstName = fullName.substring(0, positionOfSpace);
        String lastName = fullName.substring(positionOfSpace + 1);
        System.out.println(lastName);
        System.out.println(firstName);
    }

}




































