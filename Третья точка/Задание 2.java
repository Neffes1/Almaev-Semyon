import java.util.Scanner;

public class FindSquareDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем число
        int n = scanner.nextInt();

        // Проверяем, что число находится в допустимом диапазоне
        if (n <= 0 || n > 100000) {
            System.out.println("Число должно быть в диапазоне от 0 до 100000");
            return;
        }

        // Находим меньший квадрат, из которого можно вычесть n
        int lowerSquare = (int) Math.floor(Math.sqrt(n));

        // Находим больший квадрат
        int upperSquare = lowerSquare + 1;

        // Проверяем, что разность между квадратами равна n
        if (upperSquare * upperSquare - lowerSquare * lowerSquare == n) {
            // Выводим квадраты
            System.out.println(n + " = " + upperSquare * upperSquare + " - " + lowerSquare * lowerSquare);
        } else {
            // Если разность не равна n, значит такого разложения нет
            System.out.println("Невозможно представить " + n + " как разность двух последовательных квадратов");
        }
    }
}
