package ui;

import services.DepartmentService;
import services.ProductService;
import models.Product;

import java.util.Scanner;

public class ShopApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartmentService departmentService = new DepartmentService();
        ProductService productService = new ProductService();

        System.out.println("Добро пожаловать в систему управления магазином!");
        while (true) {
            System.out.println("1. Добавить отдел");
            System.out.println("2. Показать все отделы");
            System.out.println("3. Удалить отдел");
            System.out.println("4. Добавить товар");
            System.out.println("5. Показать все товары");
            System.out.println("6. Удалить товар");
            System.out.println("7. Обновить товар");
            System.out.println("8. Показать товары в отделе");
            System.out.println("9. Показать отделы без товаров");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название отдела: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите часы работы: ");
                    String hours = scanner.nextLine();
                    departmentService.addDepartment(name, hours);
                    break;

                case 2:
                    departmentService.getAllDepartments().forEach(dep ->
                            System.out.println(dep.getId() + ": " + dep.getName() + " (" + dep.getWorkingHours() + ")"));
                    break;

                case 3:
                    System.out.print("Введите ID отдела для удаления: ");
                    int depId = scanner.nextInt();
                    departmentService.deleteDepartment(depId);
                    break;

                case 4:
                    System.out.print("Введите название товара: ");
                    String productName = scanner.nextLine();
                    System.out.print("Введите цену товара: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите ID отдела: ");
                    int deptId = scanner.nextInt();
                    productService.addProduct(productName, price, deptId);
                    break;

                case 5:
                    productService.getAllProducts().forEach(prod ->
                            System.out.println(prod.getId() + ": " + prod.getName() + " - " + prod.getPrice() + " (Отдел ID: " + prod.getDepartmentId() + ")"));
                    break;

                case 6:
                    System.out.print("Введите ID товара для удаления: ");
                    int productId = scanner.nextInt();
                    productService.deleteProduct(productId);
                    break;

                case 7:
                    System.out.print("Введите ID товара для обновления: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Введите новое название товара: ");
                    String newName = scanner.nextLine();
                    System.out.print("Введите новую цену товара: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Введите новый ID отдела: ");
                    int newDeptId = scanner.nextInt();
                    productService.updateProduct(updateId, newName, newPrice, newDeptId);
                    break;

                case 8:
                    System.out.print("Введите ID отдела: ");
                    int deptIdForProducts = scanner.nextInt();
                    productService.getProductsByDepartment(deptIdForProducts).forEach(prod ->
                            System.out.println(prod.getId() + ": " + prod.getName() + " - " + prod.getPrice()));
                    break;

                case 9:
                    productService.getDepartmentsWithoutProducts().forEach(emptyDept ->
                            System.out.println("Отдел ID: " + emptyDept + " не содержит товаров"));
                    break;

                case 0:
                    System.out.println("Выход из программы...");
                    System.exit(0);

                default:
                    System.out.println("Неверный выбор! Повторите снова.");
            }
        }
    }
}
