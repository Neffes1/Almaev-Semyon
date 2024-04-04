import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку символов:");
        String input = scanner.nextLine();

        String result = transformString(input);
        System.out.println("Результат: " + result);
    }

    public static String transformString(String input) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        if (uppercaseCount > lowercaseCount) {
            return input.toUpperCase();
        } else if (lowercaseCount > uppercaseCount) {
            return input.toLowerCase();
        } else { 
            return input.toLowerCase();
        }
    }
}

