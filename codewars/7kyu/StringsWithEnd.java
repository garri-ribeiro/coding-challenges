// [7kyu] String ends with?
// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
public class Kata {
    public static boolean solution(String str, String ending) {
        int strSize = str.length();
        int endSize = ending.length();
        
        if(endSize > strSize) return false;

        return str.substring(strSize - endSize).equals(ending);
    }
}