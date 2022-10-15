public class SecondTask {
    public static void main(String[] args) {
        int[] bigMass = new int[100];
        for (int i = 1; i < 100; i++) {
            bigMass[i] += i;
            System.out.print(bigMass[i] + " ");

        }
        for (int j = bigMass.length - 1; j >= 1; j--) {
            System.out.println(bigMass[j] + " ");
        }
    }
}

