package HashMap_Questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_First_Non_Repeating_Character {
    public static void main(String[] args) {
        String str = "aabbcdde";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeating Character: " + entry.getKey());
                break;
            }
        }
    }
}
