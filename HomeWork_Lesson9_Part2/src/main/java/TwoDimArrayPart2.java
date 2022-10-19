
import java.util.Arrays;

import java.util.Random;


public class TwoDimArrayPart2 {
    public static void main(String[] args) {
        System.out.println("Array before sort: ");
        int[][] twoDimArrPt2 = new int[2][2];
        for (int massive = 0; massive < twoDimArrPt2.length; massive++) {
            for (int elements = 0; elements < twoDimArrPt2[massive].length; elements++) {
                int rand = new Random().nextInt(20);
                twoDimArrPt2[massive][elements] += rand;
                System.out.print(twoDimArrPt2[massive][elements] + "\t");
            }
            System.out.println();
        }
        sort(twoDimArrPt2);

    }

    static void sort(int[][] arraySort) {
        System.out.println("Sorted array: ");
        for (int i = 0; i < arraySort.length; i++) {
            Arrays.sort(arraySort[i]);
            System.out.println(arraySort[0][i] + "\t");
        }
        for (int j = arraySort.length - 1; j >= 0; j--) {
            Arrays.sort(arraySort[j]);
            System.out.println(arraySort[1][j] + "\t");
        }

    }

}
