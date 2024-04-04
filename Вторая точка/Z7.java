import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String result = removeDuplicateWords(input);
        System.out.println("Результат: " + result);
    }

    public static String removeDuplicateWords(String input) {
        // Разбиваем строку на массив слов
        String[] words = input.split("\\s+");

        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            result.append(word).append(" ");
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}
