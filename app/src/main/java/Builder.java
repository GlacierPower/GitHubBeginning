import java.util.InputMismatchException;
import java.util.Scanner;


public class Builder {
    public static void main(String[] args) {
        int n = 0;
        while (true) {
            System.out.println("Enter count stings");
            Scanner scanner = new Scanner(System.in);
            try {
                n = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You wrote not number");
            }
        }
        String[] str = new String[n];
        Scanner scanner2 = new Scanner(System.in);
        for (int i = 0;i<str.length;i++ ){
            System.out.println("Enter string "+(i+1));
            str[i]= scanner2.nextLine();
        }
        float average = 0f;
        for(String item:str){
           average+=(float) item.length();
        }
        average/=str.length;
        System.out.println("Average length: " + average);
        for (int i =0;i<n;i++){
            if (str[i].length()>average){
                StringBuffer buffer = new StringBuffer(str[i]);
                System.out.println("More then average: "+buffer);
            }
        }
    }
}
