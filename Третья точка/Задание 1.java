import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для шифрования:");
        String input = scanner.nextLine();

        System.out.println("Введите величину сдвига (положительный для правого, отрицательный для левого).:");
        int shift = scanner.nextInt();

        System.out.println("Введите задание (зашифровать или расшифровать):");
        String direction = scanner.nextLine();

        String output;
        if (direction.equalsIgnoreCase("зашифровать")) {
            output = encrypt(input, shift);
        } else if (direction.equalsIgnoreCase("расшифровать")) {
            output = decrypt(input, shift);
        } else {
            System.out.println("Неверное слово. Пожалуйста, введите \"зашифровать\" или \"расшифровать\".");
            return;
        }


        System.out.println("Зашифрованная/расшифрованная строка:");
        System.out.println(output);
    }

    private static String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                int shiftedCodePoint = ch + shift;

                if (Character.isUpperCase(ch)) {
                    shiftedCodePoint = shiftedCodePoint % 91 + 65;
                } else {
                    shiftedCodePoint = shiftedCodePoint % 123 + 97;
                }

                char shiftedChar = (char) shiftedCodePoint;

                encrypted.append(shiftedChar);
            } else {
                encrypted.append(ch);
            }
        }
        return encrypted.toString();
    }

    private static String decrypt(String input, int shift) {
        return encrypt(input, -shift);
    }
}
