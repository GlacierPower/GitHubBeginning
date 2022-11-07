import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.StringJoiner;

public class HomeWork {
    public static final String FILESEPARATOR = ",";
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        String str1 = "some";
        String str2 = "message";
        StringBuilder tmp1 = new StringBuilder();
        tmp1.append(str1);
        tmp1.append(" ");
        String tmp2 = tmp1.toString();
        StringBuilder tmp3=new StringBuilder();
        tmp3.append(tmp2);
        tmp3.append(str2);
        String result=tmp3.toString();
        System.out.println(result);

        StringJoiner sj = new StringJoiner(FILESEPARATOR);
        sj.add("Test 1");
        sj.add("Test 2");
        sj.add("Test 3");
        System.out.println(sj);
    }
    
}
