package com.stackroute;

import java.util.Scanner;

public class ExceptionsHandling {
    public static void main(String[] args) {
        Scanner input = null;


        try {
            int[] arr = new int[-10]; // NegativeArraySizeException
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            int[] arr1 = new int[5];
            for (int i = 0; i < arr1.length; i++) {
            }
            System.out.println(arr1[6]); //ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e);
        }


        String name = null;
        try {

            if (name.equals("deepa"))
                System.out.println("name is not a null");
            else {
                System.out.println("name is null");
            }
        } catch (NullPointerException e) {
            System.out.println(e);  //NullPointerExceptions
        }
    }
}


