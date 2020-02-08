// [6kyu] Valid Phone Number
// https://www.codewars.com/kata/525f47c79f2f25a4db000025ssss

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
      String pattern = "\\(\\d{3}\\) \\d{3}-\\d{4}";
      
      return phoneNumber.matches(pattern);
    }
  }