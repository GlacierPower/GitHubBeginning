import java.util.Random;

public class ThreeDimArrayPart2 {
    public static void main(String[] args) {
        int threeDimArrPt2[][][] = new int[2][2][3];
        for (int array2D = 0; array2D < threeDimArrPt2.length; array2D++) {
            for (int array1D = 0; array1D < threeDimArrPt2[array2D].length; array1D++) {
                for (int elements = 0; elements < threeDimArrPt2[array2D][array1D].length; elements++) {
                    int rand = new Random().nextInt(100);
                    threeDimArrPt2[array2D][array1D][elements]=rand;
                    System.out.print( threeDimArrPt2[array2D][array1D][elements]+"\t");
                }
                System.out.println();
            }
        }
    }
}
