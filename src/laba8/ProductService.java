package laba8;

import java.util.ArrayList;
import java.util.Queue;

public class ProductService {
    private static Queue<Product> products;

    public Queue<Product> getProducts() {
        return products;
    }

    public void setProducts(Queue<Product> products) {
        this.products = products;
    }


    public ProductService(Queue<Product> products) {
        setProducts(products);
    }

    public static void create(Product newProduct) {
        products.add(newProduct);
        System.out.println("Продукт добавлен: " + newProduct);
    }

    public void showProducts() {
        System.out.println("Содержимое исходной коллекции:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void removeProduct() {
        if (!products.isEmpty()) {
            Product removedProduct = products.poll();
            System.out.println("Удален продукт: " + removedProduct);
        } else {
            System.out.println("Очередь пуста.");
        }
    }

    public void printProductionByDepartment(int departmentNumber) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getDepartmentNumber() == departmentNumber) {
                filteredProducts.add(product);
            }
        }
        filteredProducts.sort((p1, p2) -> Integer.compare(p2.getQuantity(), p1.getQuantity()));
        System.out.println("Продукция цеха " + departmentNumber + " по убыванию количества:");
        for (Product product : filteredProducts) {
            String output = "Наименование: " + product.getName() + ", Количество: " + product.getQuantity();
            System.out.println(output);
        }
    }
}