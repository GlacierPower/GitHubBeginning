
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Random;

public class ThirdTask {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] randomMass = new int[15];
        for (int i = 0; i <= 15 - 1; i++) {
            int randomNumber = new Random().ints(1, 0, 99)
                    .findFirst().getAsInt();
            randomMass[i] += (int) randomNumber;
            System.out.print(randomMass[i] + " ");

        }
        int howMuch = 0;
        for (int j = 0; j < randomMass.length; j++) {
            if ((randomMass[j] % 2) == 0) {
                howMuch++;

            }
        }
        System.out.println("\nEven numbers: " + howMuch);
    }
}

