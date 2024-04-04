import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();

        boolean result = isEnding(firstString, secondString);
        System.out.println("Результат: " + result);
    }

    public static boolean isEnding(String firstString, String secondString) {
        if (firstString.length() < secondString.length()) {
            return false; 
        }

        String ending = firstString.substring(firstString.length() - secondString.length());

        return ending.equals(secondString);
    }
}
