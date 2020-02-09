// [6kyu] Backspaces in string
// https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BackspacesInString {
    public String cleanString(String s) {
        char[] characters = s.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for(char ch : characters) {
            if(ch == '#') {
                if(characterList.size() > 0) {
                    characterList.remove(characterList.size() - 1);
                }
            } else {
                characterList.add(ch);
            }
        }
        return characterList.stream().map((String::valueOf)).collect(Collectors.joining());
    }
}