package com.pluralsight.fullname;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Enter your suffix (press enter to skip): ");
        String suffix = scanner.nextLine();

        System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName + " " + suffix);
















    }
}
