import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str: ");
        String firstStr = sc.nextLine();
        System.out.println("Enter str: ");
        String secondStr = sc.nextLine();
        System.out.println("Enter str: ");
        String thirdStr = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(firstStr).reverse()
                .append("\n")
                .append(secondStr.toLowerCase())
                .append("\n")
                .append(thirdStr);
        System.out.print(stringBuffer + " ");

    }
}
