package com.stackroute;

import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of desired elements in the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of arrray one by one");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        checkConsecutive(array, size);

    }

    public static void checkConsecutive(int[] array, int size) {
        boolean result = true;
        for (int i = 0; i < size - 1; i++) {
            if ((array[i + 1] - array[i]) == 1) {
            } else {
                result = false;
                break;
            }
        }
        if (result)
            System.out.println("consecutive number");
        else
            System.out.println("non-consecutive number");
    }
}