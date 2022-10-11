

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreditCardThroughFile extends Write{

    public static void main(String[] args) throws IOException {
        Write file = new Write();
        file.setBalance(7);
        file.setSecondBalance(3);
        file.setSecondBalance(4);
        file.setSecondCard(8);
        file.setSecondArray(file.secondArray);
        file.write();
    }
}


class Write {
    int [][] array = new int[2][3];
    int cardNumber=array[1][2];
    int secondCard =array[1][0];
    int balance = array[2][1];
    int secondBalance = array[1][1];
    int [][] secondArray=array;

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setSecondCard(int secondCard) {
        this.secondCard = secondCard;
    }

    public void setSecondArray(int[][] secondArray) {
        secondArray = new int[][]{{556455488, 10}, {254565545, 10}};;
        secondArray[0][0]=cardNumber;
        secondArray[1][0]=secondCard;
        secondArray[0][1]=secondBalance;
        secondArray[1][1]=balance;
        this.secondArray = secondArray;
    }

    public void setSecondBalance(int bal) {
        array[1][1]=secondBalance;
        this.secondBalance = secondBalance+bal;
    }

    public void setBalance(int newBal) {
        array[0][1]=newBal;
        if (newBal<=balance){
        this.balance = balance-newBal;
    }
        else System.out.println("You don't have enough money");
    }

    void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("HomeWorkLesson6/src/main/java/CreditCard.txt"));
        for (int i =0;i< array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                writer.write(String.valueOf(array[i][j]));
                writer.write(" ");
            }
            writer.write("\r\n");
        }
            writer.flush();
        }
}


