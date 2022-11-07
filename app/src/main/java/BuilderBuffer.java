public class BuilderBuffer {
    public static void main(String[] args) {
        String str = "sun";
        String str1 = "earth";
        String str2 = "moon";
        StringBuilder stringBuilder = new StringBuilder();
        if (str.length()>str1.length()&&str.length()>str2.length()){
            System.out.println(str);
        }else if (str1.length()>str.length()&&str1.length()>str2.length()) {
            System.out.println(str1);
        }else {
            System.out.println(str2);
        }
    }
}
