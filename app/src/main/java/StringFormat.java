import androidx.annotation.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormat {
    public static void main(String[] args) {
        String s = String.format("a=%d, b=%d,c=%d",1,2,3);
        String s2 = String.format("as=%s, bs=%s,cs=%s","string as","string bs","string cs");
        System.out.println(s+s2);

        Pattern pattern = Pattern.compile("@gmail.COM",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("glacierpassion@gmail.com");
        boolean matchFound  = matcher.find();
        if(matchFound){
            System.out.println("Match found " + matcher.toString());
        }else {
            System.out.println("Match not found "+matcher);
        }

    }

}
