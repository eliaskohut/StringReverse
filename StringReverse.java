import java.util.Collections;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String str = "123ASdsas";
        System.out.println(str);
        System.out.println(reverse1(str));
        System.out.println(reverse2(str));
    }
    public static String reverse1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static String reverse2(String str) {
        char[] strarr = str.toCharArray();
        Collections.reverse(List.of(strarr));
        StringBuilder st = new StringBuilder();
        for(int i = 0;i<strarr.length;i++ ){
            st.append(strarr[strarr.length - 1 - i]);
        }
        return st.toString();
    }
}
