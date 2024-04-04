import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        String formattedName = formatName(name);
        System.out.println("Привет, " + formattedName + "!");
    }

    public static String formatName(String name) {
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        return formattedName;
    }
}
