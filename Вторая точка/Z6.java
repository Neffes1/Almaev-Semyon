import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] memoryCell = new int[3];
        int index = 0;

        while (true) {
            System.out.println("Введите число (для выхода введите 0):");
            int number = scanner.nextInt();

            if (number == 0) {
                break; 
            }

            if (index < memoryCell.length) {

                memoryCell[index] = number;
                index++;
            } else {
              
                int minIndex = findIndexOfMinValue(memoryCell);
                if (number > memoryCell[minIndex]) {
                    memoryCell[minIndex] = number;
                }
            }
        }

        System.out.println("Результат:");
        for (int value : memoryCell) {
            System.out.print(value + " ");
        }
    }

    public static int findIndexOfMinValue(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
