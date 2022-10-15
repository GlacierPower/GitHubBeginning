
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Random;


public class FifthTask {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] maxNumbArray = new int[12];
        for (int i = 0; i < maxNumbArray.length; i++) {
            int randNumb = new Random().nextInt(15);
            maxNumbArray[i] += (int) randNumb;
            System.out.print(maxNumbArray[i] + " ");
        }
        int maxValue = Arrays.stream(maxNumbArray).max().getAsInt();
        System.out.println("\nMax value: " + maxValue);
        System.out.println("Index max value: " + findIndex(maxNumbArray, maxValue));
        System.out.println("Index max value: " + findInd(maxNumbArray, maxValue));

    }

    public static int findIndex(int[] array, int index) {
        return Ints.indexOf(array, index);
    }

    public static int findInd(int[] array, int index) { //or like this, but the first way i like more))
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                return i;
            }
        }
        return -1;
    }
}
