package util;

public class StringUtil {

    public static String repeat(String str, int times){
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(str).repeat(Math.max(0, times)));
        return result.toString();
    }

    public boolean isNotEmpty(String str){
        return !str.isEmpty();
    }

    public boolean isEmpty(String str){
        return str == null || str.isEmpty() ;
    }
}
