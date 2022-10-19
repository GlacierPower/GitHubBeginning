

public class ThreeDimArray {
    int[][][] threeDimArray = {
            {
                    {15, 67, 45, 123},
                    {1, 45, 23}
            },
            {
                    {25, 88}
            }
    };

    public static void main(String[] args) {
        ThreeDimArray threeDimArray = new ThreeDimArray();
        threeDimArray.firstOut();
        threeDimArray.secondOut();
    }

    void firstOut() {
        System.out.println("First out: ");
        for (int[][] ints : threeDimArray) {
            for (int array1D = 0; array1D < ints.length; array1D++) {
                for (int elements = 0; elements < ints[array1D].length; elements++) {
                    System.out.print(ints[array1D][elements] + "\t");
                }
                System.out.println();
            }
        }
    }

    void secondOut() {
        System.out.println("\nSecond out: ");
        for (int[][] ints : threeDimArray) {
            for (int array1D = 0; array1D < ints.length; array1D++) {
                for (int elements = 0; elements < ints[array1D].length; elements++) {
                    System.out.println(+ints[array1D][elements]);
                }
            }
        }
    }
}
