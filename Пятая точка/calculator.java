import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private static final String HISTORY_FILE = "calculator_history.txt";
    private static List<String> history = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите уравнение (или нажмите \"r\" для выхода): ");
            String input = scanner.nextLine();

            if (input.equals("r")) {
                break;
            }

            try {
                double result = calculate(input);
                System.out.println("Result: " + result);
                String record = input + " = " + result;
                if (!history.contains(record)) {
                    history.add(record);
                }
            } catch (Exception e) {
                System.out.println("Invalid equation.");
            }
        }

        scanner.close();
        saveHistory(); 
    }

    private static double calculate(String equation) {
        return Double.parseDouble(new Expression(equation).eval());
    }

    private static void saveHistory() {
        try (FileWriter writer = new FileWriter(new File(HISTORY_FILE), true)) {
            for (String equation : history) {
                writer.write(equation + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
