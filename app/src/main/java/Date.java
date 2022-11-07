import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        String pattern ="MMMM-dd-yyyy E\n HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new java.util.Date());
        System.out.println(date);
    }
}
