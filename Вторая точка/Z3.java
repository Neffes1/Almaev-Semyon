import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        String resultString = removeVowels(inputString);
        System.out.println("Результат: " + resultString);
    }

    public static String removeVowels(String str) {
        String regex = "[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]";
        
        String result = str.replaceAll(regex, "");
        
        return result;
    }
}
