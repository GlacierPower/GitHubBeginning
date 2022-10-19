package com.zhenya_flower.homework_lesson9_part2;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[2][2];
        twoDimArray[0][0] = 18;
        twoDimArray[0][1] = 15;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 9;
        for (int massive = 0; massive < twoDimArray.length; massive++) {
            for (int element = 0; element < twoDimArray[massive].length; element++) {
                System.out.println(twoDimArray[massive][element] + "\n");
            }
        }
    }
}