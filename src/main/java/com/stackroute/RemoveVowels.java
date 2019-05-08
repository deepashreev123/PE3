package com.stackroute;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        String newstring;
        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String[] a = input.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Actual string is " + a[i]);
            newstring = a[i].replaceAll("[aeiou]", "");
            System.out.println("string is " + newstring);
        }
    }
}