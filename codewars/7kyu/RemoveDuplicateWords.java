// [7 kyu] Remove duplicate words
// https://www.codewars.com/kata/5b39e3772ae7545f650000fc

public static String removeDuplicateWords(String s){
    String[] strings = s.split(" ");

    Set<String> uniqueWord = new LinkedHashSet<>();
    uniqueWord.addAll(Arrays.asList(strings));

    String removedDuplicates = String.join(" ", uniqueWord);
    return removedDuplicates;
}