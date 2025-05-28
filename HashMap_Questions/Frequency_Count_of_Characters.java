package HashMap_Questions;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Count_of_Characters {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequencies: " + freqMap);
    }
}
