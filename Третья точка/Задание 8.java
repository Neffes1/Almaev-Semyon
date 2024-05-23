import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CaesarCipherDecoder {

    public static void main(String[] args) {
        String encryptedText = getTextFromUrl("https://fish-text.ru/get");

        Map<Character, Integer> letterFrequencies = calculateLetterFrequencies(encryptedText);

        char mostCommonLetter = findMostCommonLetter(letterFrequencies);

        int shift = mostCommonLetter - 'e';
        if (shift < 0) {
            shift = 26 + shift;
        }

        String decryptedText = decryptCaesarCipher(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    private static String getTextFromUrl(String url) {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    private static Map<Character, Integer> calculateLetterFrequencies(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char letter : text.toCharArray()) {
            if (Character.isLetter(letter)) {
                char lowercaseLetter = Character.toLowerCase(letter);
                frequencies.put(lowercaseLetter, frequencies.getOrDefault(lowercaseLetter, 0) + 1);
            }
        }
        return frequencies;
    }

    private static char findMostCommonLetter(Map<Character, Integer> frequencies) {
        char mostCommonLetter = 'a';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonLetter = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mostCommonLetter;
    }

    private static String decryptCaesarCipher(String text, int shift) {
        StringBuilder decryptedText = new StringBuilder();
        for (char letter : text.toCharArray()) {
            if (Character.isLetter(letter)) {
                char decryptedLetter = (char) (letter - shift);
                if ((Character.isLowerCase(letter) && decryptedLetter < 'a') ||
                        (Character.isUpperCase(letter) && decryptedLetter < 'A')) {
                    decryptedLetter += 26;
                }
                decryptedText.append(decryptedLetter);
            } else {
                decryptedText.append(letter);
            }
        }
        return decryptedText.toString();
    }
}
