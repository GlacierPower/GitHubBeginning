import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSort = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < bubbleSort.length - 1; i++) {
                if (bubbleSort[i] < bubbleSort[i + 1]) {
                    isSorted = false;
                    buffer = bubbleSort[i];
                    bubbleSort[i] = bubbleSort[i + 1];
                    bubbleSort[i + 1] = buffer;
                }
            }

        }
        System.out.println(Arrays.toString(bubbleSort));

    }
}