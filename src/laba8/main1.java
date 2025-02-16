package laba8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Queue<Product> products = createQueue(
                new Product("Продукт1", 20, 1),
                new Product("Продукт2", 15, 1),
                new Product("Продукт3", 10, 2),
                new Product("Продукт4", 25, 1),
                new Product("Продукт5", 18, 2),
                new Product("Продукт6", 22, 1),
                new Product("Продукт7", 12, 3),
                new Product("Продукт8", 5, 3),
                new Product("Продукт9", 14, 2),
                new Product("Продукт10", 9, 2),
                new Product("Продукт11", 30, 1),
                new Product("Продукт12", 16, 3),
                new Product("Продукт13", 8, 1),
                new Product("Продукт14", 17, 2),
                new Product("Продукт15", 21, 3));

        ProductService productService = new ProductService(products);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Показать содержимое исходной коллекции");
            System.out.println("2. Добавить элемент в исходную коллекцию");
            System.out.println("3. Удалить элемент из исходной коллекции");
            System.out.println("4. Вывести количество выпущенных изделий по каждому наименованию для заданного цеха");
            System.out.println("5. Выход");
            System.out.print("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productService.showProducts();
                    break;
                case 2:
                    Product newproduct = Product.addProduct(scanner);
                    ProductService.create(newproduct);
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    System.out.print("Введите номер цеха: ");
                    int departmentNumber = scanner.nextInt();
                    productService.printProductionByDepartment(departmentNumber);
                    break;
                case 5:
                    System.out.println("Выход.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private static Queue<Product> createQueue(Product... products) {
        Queue<Product> queue = new LinkedList<>();
        for (Product product : products) {
            queue.add(product);
        }
        return queue;
    }
}
