// Package Declaration
package Ecommerce;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

// Customer Class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

// Order Class
class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return product.getPrice() * quantity;
    }

    public void displayOrder() {
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }
}

// Main Class
public class EcommerceApp {
    public static void main(String[] args) {

        Product product1 = new Product("Laptop", 50000);
        Customer customer1 = new Customer("Amit");
        Order order1 = new Order(product1, 2);

        System.out.println("=== Customer Details ===");
        customer1.displayCustomer();

        System.out.println("\n=== Order Details ===");
        order1.displayOrder();
    }
}
