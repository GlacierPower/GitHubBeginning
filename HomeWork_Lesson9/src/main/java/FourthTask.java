import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Random;

public class FourthTask {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] randomMass = new int[21];
        for (int i = 0; i <= randomMass.length - 1; i++) {
            int randomNumber = new Random().nextInt(99);
            randomMass[i] +=  randomNumber;
        }
        String oldArray = Arrays.toString(randomMass);
        System.out.print("Old array: " + oldArray.replace
                ("]", "").replace("[", ""));
        for (int j = 0; j <= randomMass.length - 1; j += 2) {
            randomMass[j] = 0;
        }
        String newArray = Arrays.toString(randomMass);
        System.out.println("\nNew array: " + newArray.replace
                ("]", "").replace("[", ""));

    }

}


