import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: начало ряда, шаг и количество шагов:");
        int start = scanner.nextInt(); 
        int step = scanner.nextInt();  
        int numberOfSteps = scanner.nextInt(); 

        printSeries(start, step, numberOfSteps);
    }

    public static void printSeries(int start, int step, int numberOfSteps) {
        int currentValue = start;
        for (int i = 0; i < numberOfSteps; i++) {
            System.out.print(currentValue + " ");
            currentValue += step;
        }
    }
}
