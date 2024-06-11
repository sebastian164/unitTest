package util;

public class StringUtil {

    public static String repeat(String str, int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }

    public boolean isNotEmpty(String str){
        return !str.isEmpty();
    }

    public boolean isEmpty(String str){
        return str == null || str.isEmpty() ;
    }
}
