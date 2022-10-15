import java.util.Arrays;

public class SortByInsert {
    public static void main(String[] args) {
        int[] insertSort = {88, 39, 22, 44, 61, 1, 12, 54, 67, 20, 2, 9, 39};
        for (int i = 0; i < insertSort.length; i++) {
            int newValue = insertSort[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (newValue < insertSort[j]) {
                    insertSort[j + 1] = insertSort[j];
                } else {
                    break;
                }
            }
            insertSort[j + 1] = newValue;
        }
        System.out.println(Arrays.toString(insertSort));
    }
}