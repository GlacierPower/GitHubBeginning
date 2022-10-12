

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreditCardThroughFile extends Write {

    public static void main(String[] args) throws IOException {
        Write file = new Write();
        file.array = new int[][]{{556455488, 10}, {254565545, 10}, {564564656, 10}};
        file.setBalance(3);
        file.setSecondBalance(11);
        file.setThirdBalance(5);
        file.setSecondArray(file.secondArray);
        file.write();


    }
}


class Write {
    int[][] array = new int[3][3];
    int balance;
    int secondBalance;
    int thirdBalance;
    int[][] secondArray = array;
    String message = "You don't have enough money in a credit card № ";
    public void setSecondArray(int[][] secondArray1) {

        secondArray[0][1] = array[0][1] - getBalance();//balance
        secondArray[1][0] = array[1][0];
        secondArray[0][0] = array[0][0];
        secondArray[1][1] = array[1][1] + getSecondBalance();//second balance
        secondArray[2][0] = array[2][0];
        secondArray[2][1] = array[2][1] + getThirdBalance();//third balance
        this.secondArray = secondArray1;
    }

    public int getBalance() {
        return balance;
    }

    public int getThirdBalance() {
        return thirdBalance;
    }

    public int getSecondBalance() {
        return secondBalance;
    }

    public void setThirdBalance(int balThird) {
        this.thirdBalance = secondArray[2][1] + balThird;
    }

    public void setSecondBalance(int secBal) {
        if (array[1][1] < secBal) {
            System.out.println(message+array[1][0]);
        } else
            this.secondBalance = secondArray[1][1] - secBal;
    }

    public void setBalance(int firstBal) {
        if (array[0][1] < firstBal) {
            System.out.println(message+array[0][0]);
        } else
            this.balance = secondArray[0][1] + firstBal;
    }


    void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("HomeWorkLesson6/src/main/java/CreditCard.txt"));
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray.length-1; j++) {
                writer.write(String.valueOf(secondArray[i][j]));
                writer.write(" ");
            }
            writer.write("\r\n");
        }
        writer.flush();

    }
}


