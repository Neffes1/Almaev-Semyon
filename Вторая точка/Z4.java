import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int start = scanner.nextInt(); 
        int step = scanner.nextInt();  

        System.out.println("Введите значение для остановки:");
        int stopValue = scanner.nextInt(); 

        printSquares(start, step, stopValue);
    }

    public static void printSquares(int start, int step, int stopValue) {
        int currentValue = start;
        while (true) {
            int square = currentValue * currentValue;
            System.out.print(square + " ");

            currentValue += step;

            if (currentValue < start || currentValue >= stopValue) {
                break;
            }
        }
    }
}
