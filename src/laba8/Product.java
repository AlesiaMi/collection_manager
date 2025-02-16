package laba8;

import java.util.Scanner;

public class Product {
    private String name;
    private int quantity;
    private int departmentNumber;

    public Product(String name, int quantity, int departmentNumber) {
        setName(name);
        setQuantity(quantity);
        setDepartmentNumber(departmentNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public static Product addProduct(Scanner scanner) {
        System.out.print("Введите наименование продукта: ");
        String name = scanner.next();
        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();
        System.out.print("Введите номер цеха: ");
        int departmentNumber = scanner.nextInt();
        return new Product(name, quantity, departmentNumber);
    }

    @Override
    public String toString() {
        return "Продукция: название='" + getName() + "', количество=" + getQuantity() + ", номер цеха=" + getDepartmentNumber();
    }
}
