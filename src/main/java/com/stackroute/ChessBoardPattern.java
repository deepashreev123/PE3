package com.stackroute;

public class ChessBoardPattern {
    public static void main(String[] args) {
        for (int row = 0; row < 8; row++) {
            System.out.println();

            for (int column = 0; column < 4; column++) {
                if (row % 2 != 0) {
                    System.out.print("bb" + "|" + "ww" + "|");
                } else {
                    System.out.print("ww" + "|" + "bb" + "|");
                }
            }
        }
    }
}

