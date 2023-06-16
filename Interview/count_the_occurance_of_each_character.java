package Interview;


import java.util.HashMap;
import java.util.Map;

public class count_the_occurance_of_each_character {
	
	
    public static Map<Character, Integer> countCharacters(String input) {
    	
        Map<Character, Integer> characterCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }
        }

        return characterCount;
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        Map<Character, Integer> result = countCharacters(inputString);
        System.out.println(result);
    }
}
