package com.pluralsight.fullname;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fullName = input.nextLine();

        System.out.println("billing street: ");
        String billingStreet = input.nextLine();

        System.out.println("billing city: ");
        String billingCity = input.nextLine();

        System.out.println("billing state: ");
        String billingState = input.nextLine();

        System.out.println("billing zip: ");
        String billingZip = input.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(billingStreet).append("\n");
        builder.append(billingCity).append(" ").append(billingState).append(" ").append(billingZip);

        String address = builder.toString();
        System.out.print(address);

  //      displayAddress(billingStreet, billingCity, billingState, billingZip);


    }



public class shippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Shipping street: ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping city: ");
        String shippingCity = input.nextLine();

        System.out.print("Shipping state: ");
        String shippingState = input.nextLine();

        System.out.print("Shipping zip: ");
        String shippingZip = input.nextLine();


    }



