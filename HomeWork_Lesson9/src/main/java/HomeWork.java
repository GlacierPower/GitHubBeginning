
public class HomeWork {
    public static void main(String[] args) {
        int[] intMass = new int[21];
        for (int i = 0; i <= intMass.length; i++) {
            if ((i % 2) == 0) {
                intMass[i] += i;
                System.out.print(intMass[i] + " ");
            }
        }
    }
}



