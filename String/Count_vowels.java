package String;

public class Count_vowels {
    public static void main(String[] args) {
        String input = "Tushar Kewat";
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
