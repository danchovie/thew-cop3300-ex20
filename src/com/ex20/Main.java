/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
        int order;
        String state, county = "";
        double tax, total=0.0;
        System.out.print("What is the order amount? ");
        order = newScanner.nextInt();
        newScanner.nextLine();
        System.out.print("What state do you live in? ");
        state = newScanner.nextLine();
        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            county = newScanner.nextLine();
            if(county.equals("Eau Claire")){
                tax = order*0.055;
                total=order+tax;
            }
            else if(county.equals("Dunn")){
                tax = order*0.054;
                total=order+tax;
            }
            else{
                tax = order*0.05;
                total=order+tax;
            }
        }
        else if(state.equals("Illinois")){
            tax = order*0.08;
            total=order+tax;
        }
        else{
            tax=0;
        }
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax, total);
    }
}
